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
 * 负责人
 *
 * @author 
 * @email
 */
@TableName("fuzeren")
public class FuzerenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FuzerenEntity() {

	}

	public FuzerenEntity(T t) {
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
     * 负责人姓名
     */
    @TableField(value = "fuzeren_name")

    private String fuzerenName;


    /**
     * 负责人手机号
     */
    @TableField(value = "fuzeren_phone")

    private String fuzerenPhone;


    /**
     * 负责人身份证号
     */
    @TableField(value = "fuzeren_id_number")

    private String fuzerenIdNumber;


    /**
     * 照片
     */
    @TableField(value = "fuzeren_photo")

    private String fuzerenPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


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
	 * 设置：负责人姓名
	 */
    public String getFuzerenName() {
        return fuzerenName;
    }


    /**
	 * 获取：负责人姓名
	 */

    public void setFuzerenName(String fuzerenName) {
        this.fuzerenName = fuzerenName;
    }
    /**
	 * 设置：负责人手机号
	 */
    public String getFuzerenPhone() {
        return fuzerenPhone;
    }


    /**
	 * 获取：负责人手机号
	 */

    public void setFuzerenPhone(String fuzerenPhone) {
        this.fuzerenPhone = fuzerenPhone;
    }
    /**
	 * 设置：负责人身份证号
	 */
    public String getFuzerenIdNumber() {
        return fuzerenIdNumber;
    }


    /**
	 * 获取：负责人身份证号
	 */

    public void setFuzerenIdNumber(String fuzerenIdNumber) {
        this.fuzerenIdNumber = fuzerenIdNumber;
    }
    /**
	 * 设置：照片
	 */
    public String getFuzerenPhoto() {
        return fuzerenPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setFuzerenPhoto(String fuzerenPhoto) {
        this.fuzerenPhoto = fuzerenPhoto;
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
        return "Fuzeren{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", fuzerenName=" + fuzerenName +
            ", fuzerenPhone=" + fuzerenPhone +
            ", fuzerenIdNumber=" + fuzerenIdNumber +
            ", fuzerenPhoto=" + fuzerenPhoto +
            ", sexTypes=" + sexTypes +
            ", createTime=" + createTime +
        "}";
    }
}
