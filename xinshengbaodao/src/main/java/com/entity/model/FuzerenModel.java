package com.entity.model;

import com.entity.FuzerenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 负责人
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FuzerenModel implements Serializable {
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
     * 负责人姓名
     */
    private String fuzerenName;


    /**
     * 负责人手机号
     */
    private String fuzerenPhone;


    /**
     * 负责人身份证号
     */
    private String fuzerenIdNumber;


    /**
     * 照片
     */
    private String fuzerenPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


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
	 * 获取：负责人姓名
	 */
    public String getFuzerenName() {
        return fuzerenName;
    }


    /**
	 * 设置：负责人姓名
	 */
    public void setFuzerenName(String fuzerenName) {
        this.fuzerenName = fuzerenName;
    }
    /**
	 * 获取：负责人手机号
	 */
    public String getFuzerenPhone() {
        return fuzerenPhone;
    }


    /**
	 * 设置：负责人手机号
	 */
    public void setFuzerenPhone(String fuzerenPhone) {
        this.fuzerenPhone = fuzerenPhone;
    }
    /**
	 * 获取：负责人身份证号
	 */
    public String getFuzerenIdNumber() {
        return fuzerenIdNumber;
    }


    /**
	 * 设置：负责人身份证号
	 */
    public void setFuzerenIdNumber(String fuzerenIdNumber) {
        this.fuzerenIdNumber = fuzerenIdNumber;
    }
    /**
	 * 获取：照片
	 */
    public String getFuzerenPhoto() {
        return fuzerenPhoto;
    }


    /**
	 * 设置：照片
	 */
    public void setFuzerenPhoto(String fuzerenPhoto) {
        this.fuzerenPhoto = fuzerenPhoto;
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
