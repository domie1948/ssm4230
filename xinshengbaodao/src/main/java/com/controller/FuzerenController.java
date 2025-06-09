package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.annotation.IgnoreAuth;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.FuzerenEntity;
import com.entity.view.FuzerenView;
import com.service.DictionaryService;
import com.service.FuzerenService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 负责人
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/fuzeren")
public class FuzerenController {
    private static final Logger logger = LoggerFactory.getLogger(FuzerenController.class);

    @Autowired
    private FuzerenService fuzerenService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
     
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        params.put("orderBy","id");
        PageUtils page = fuzerenService.queryPage(params);

        //字典表数据转换
        List<FuzerenView> list =(List<FuzerenView>)page.getList();
        for(FuzerenView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FuzerenEntity fuzeren = fuzerenService.selectById(id);
        if(fuzeren !=null){
            //entity转view
            FuzerenView view = new FuzerenView();
            BeanUtils.copyProperties( fuzeren , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody FuzerenEntity fuzeren, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,fuzeren:{}",this.getClass().getName(),fuzeren.toString());
        Wrapper<FuzerenEntity> queryWrapper = new EntityWrapper<FuzerenEntity>()
            .eq("username", fuzeren.getUsername())
            .or()
            .eq("fuzeren_phone", fuzeren.getFuzerenPhone())
            .or()
            .eq("fuzeren_id_number", fuzeren.getFuzerenIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FuzerenEntity fuzerenEntity = fuzerenService.selectOne(queryWrapper);
        if(fuzerenEntity==null){
            fuzeren.setCreateTime(new Date());
            fuzeren.setPassword("123456");
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      fuzeren.set
        //  }
            fuzerenService.insert(fuzeren);
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FuzerenEntity fuzeren, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,fuzeren:{}",this.getClass().getName(),fuzeren.toString());
        //根据字段查询是否有相同数据
        Wrapper<FuzerenEntity> queryWrapper = new EntityWrapper<FuzerenEntity>()
            .notIn("id",fuzeren.getId())
            .andNew()
            .eq("username", fuzeren.getUsername())
            .or()
            .eq("fuzeren_phone", fuzeren.getFuzerenPhone())
            .or()
            .eq("fuzeren_id_number", fuzeren.getFuzerenIdNumber());
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FuzerenEntity fuzerenEntity = fuzerenService.selectOne(queryWrapper);
        if("".equals(fuzeren.getFuzerenPhoto()) || "null".equals(fuzeren.getFuzerenPhoto())){
                fuzeren.setFuzerenPhoto(null);
        }
        if(fuzerenEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      fuzeren.set
            //  }
            fuzerenService.updateById(fuzeren);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"账户或者身份证号或者手机号已经被使用");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        fuzerenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        FuzerenEntity fuzeren = fuzerenService.selectOne(new EntityWrapper<FuzerenEntity>().eq("username", username));
        if(fuzeren==null || !fuzeren.getPassword().equals(password)) {
            return R.error("账号或密码不正确");
        }
        //  // 获取监听器中的字典表
        // ServletContext servletContext = ContextLoader.getCurrentWebApplicationContext().getServletContext();
        // Map<String, Map<Integer, String>> dictionaryMap= (Map<String, Map<Integer, String>>) servletContext.getAttribute("dictionaryMap");
        // Map<Integer, String> role_types = dictionaryMap.get("role_types");
        // role_types.get(yonghu.getRoleTypes());
        String token = tokenService.generateToken(fuzeren.getId(),username, "fuzeren", "负责人");
        R r = R.ok();
        r.put("token", token);
        r.put("role","负责人");
        r.put("username",fuzeren.getFuzerenName());
        r.put("tableName","fuzeren");
        r.put("userId",fuzeren.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody FuzerenEntity fuzeren){
    //    	ValidatorUtils.validateEntity(user);
        if(fuzerenService.selectOne(new EntityWrapper<FuzerenEntity>().eq("username", fuzeren.getUsername()).orNew().eq("fuzeren_phone",fuzeren.getFuzerenPhone()).orNew().eq("fuzeren_id_number",fuzeren.getFuzerenIdNumber())) !=null) {
            return R.error("账户已存在或手机号或身份证号已经被使用");
        }
        fuzeren.setCreateTime(new Date());
        fuzerenService.insert(fuzeren);
        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id){
        FuzerenEntity fuzeren = new FuzerenEntity();
        fuzeren.setPassword("123456");
        fuzeren.setId(id);
        fuzerenService.updateById(fuzeren);
        return R.ok();
    }

    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrFuzeren(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        FuzerenEntity fuzeren = fuzerenService.selectById(id);
        return R.ok().put("data", fuzeren);
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }






}

