package com.entity.model;

import com.entity.YonghuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 用户
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YonghuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 学号
     */
    private String yonghuNumber;


    /**
     * 学生姓名
     */
    private String yonghuName;


    /**
     * 学生手机号
     */
    private String yonghuPhone;


    /**
     * 学生身份证号
     */
    private String yonghuIdNumber;


    /**
     * 学生照片
     */
    private String yonghuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 学院
     */
    private Integer xueyuanTypes;


    /**
     * 专业
     */
    private Integer zhuanyeTypes;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 辅导员
     */
    private Integer fudaoyuanTypes;


    /**
     * 是否报道
     */
    private Integer yonghuYesnoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：学号
	 */
    public String getYonghuNumber() {
        return yonghuNumber;
    }


    /**
	 * 设置：学号
	 */
    public void setYonghuNumber(String yonghuNumber) {
        this.yonghuNumber = yonghuNumber;
    }
    /**
	 * 获取：学生姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 设置：学生姓名
	 */
    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 获取：学生手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 设置：学生手机号
	 */
    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 获取：学生身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 设置：学生身份证号
	 */
    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 获取：学生照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 设置：学生照片
	 */
    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：学院
	 */
    public Integer getXueyuanTypes() {
        return xueyuanTypes;
    }


    /**
	 * 设置：学院
	 */
    public void setXueyuanTypes(Integer xueyuanTypes) {
        this.xueyuanTypes = xueyuanTypes;
    }
    /**
	 * 获取：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 设置：专业
	 */
    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 设置：班级
	 */
    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：辅导员
	 */
    public Integer getFudaoyuanTypes() {
        return fudaoyuanTypes;
    }


    /**
	 * 设置：辅导员
	 */
    public void setFudaoyuanTypes(Integer fudaoyuanTypes) {
        this.fudaoyuanTypes = fudaoyuanTypes;
    }
    /**
	 * 获取：是否报道
	 */
    public Integer getYonghuYesnoTypes() {
        return yonghuYesnoTypes;
    }


    /**
	 * 设置：是否报道
	 */
    public void setYonghuYesnoTypes(Integer yonghuYesnoTypes) {
        this.yonghuYesnoTypes = yonghuYesnoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
