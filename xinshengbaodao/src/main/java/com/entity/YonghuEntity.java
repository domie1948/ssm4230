package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 用户
 *
 * @author 
 * @email
 */
@TableName("yonghu")
public class YonghuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuEntity() {

	}

	public YonghuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 学号
     */
    @TableField(value = "yonghu_number")

    private String yonghuNumber;


    /**
     * 学生姓名
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 学生手机号
     */
    @TableField(value = "yonghu_phone")

    private String yonghuPhone;


    /**
     * 学生身份证号
     */
    @TableField(value = "yonghu_id_number")

    private String yonghuIdNumber;


    /**
     * 学生照片
     */
    @TableField(value = "yonghu_photo")

    private String yonghuPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 学院
     */
    @TableField(value = "xueyuan_types")

    private Integer xueyuanTypes;


    /**
     * 专业
     */
    @TableField(value = "zhuanye_types")

    private Integer zhuanyeTypes;


    /**
     * 班级
     */
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 辅导员
     */
    @TableField(value = "fudaoyuan_types")

    private Integer fudaoyuanTypes;


    /**
     * 是否报道
     */
    @TableField(value = "yonghu_yesno_types")

    private Integer yonghuYesnoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：学号
	 */
    public String getYonghuNumber() {
        return yonghuNumber;
    }


    /**
	 * 获取：学号
	 */

    public void setYonghuNumber(String yonghuNumber) {
        this.yonghuNumber = yonghuNumber;
    }
    /**
	 * 设置：学生姓名
	 */
    public String getYonghuName() {
        return yonghuName;
    }


    /**
	 * 获取：学生姓名
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：学生手机号
	 */
    public String getYonghuPhone() {
        return yonghuPhone;
    }


    /**
	 * 获取：学生手机号
	 */

    public void setYonghuPhone(String yonghuPhone) {
        this.yonghuPhone = yonghuPhone;
    }
    /**
	 * 设置：学生身份证号
	 */
    public String getYonghuIdNumber() {
        return yonghuIdNumber;
    }


    /**
	 * 获取：学生身份证号
	 */

    public void setYonghuIdNumber(String yonghuIdNumber) {
        this.yonghuIdNumber = yonghuIdNumber;
    }
    /**
	 * 设置：学生照片
	 */
    public String getYonghuPhoto() {
        return yonghuPhoto;
    }


    /**
	 * 获取：学生照片
	 */

    public void setYonghuPhoto(String yonghuPhoto) {
        this.yonghuPhoto = yonghuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：学院
	 */
    public Integer getXueyuanTypes() {
        return xueyuanTypes;
    }


    /**
	 * 获取：学院
	 */

    public void setXueyuanTypes(Integer xueyuanTypes) {
        this.xueyuanTypes = xueyuanTypes;
    }
    /**
	 * 设置：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 获取：专业
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：辅导员
	 */
    public Integer getFudaoyuanTypes() {
        return fudaoyuanTypes;
    }


    /**
	 * 获取：辅导员
	 */

    public void setFudaoyuanTypes(Integer fudaoyuanTypes) {
        this.fudaoyuanTypes = fudaoyuanTypes;
    }
    /**
	 * 设置：是否报道
	 */
    public Integer getYonghuYesnoTypes() {
        return yonghuYesnoTypes;
    }


    /**
	 * 获取：是否报道
	 */

    public void setYonghuYesnoTypes(Integer yonghuYesnoTypes) {
        this.yonghuYesnoTypes = yonghuYesnoTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghu{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", yonghuNumber=" + yonghuNumber +
            ", yonghuName=" + yonghuName +
            ", yonghuPhone=" + yonghuPhone +
            ", yonghuIdNumber=" + yonghuIdNumber +
            ", yonghuPhoto=" + yonghuPhoto +
            ", sexTypes=" + sexTypes +
            ", xueyuanTypes=" + xueyuanTypes +
            ", zhuanyeTypes=" + zhuanyeTypes +
            ", banjiTypes=" + banjiTypes +
            ", fudaoyuanTypes=" + fudaoyuanTypes +
            ", yonghuYesnoTypes=" + yonghuYesnoTypes +
            ", createTime=" + createTime +
        "}";
    }
}
