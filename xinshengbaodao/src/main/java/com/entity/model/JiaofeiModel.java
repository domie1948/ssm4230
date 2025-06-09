package com.entity.model;

import com.entity.JiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 缴费
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaofeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 缴费名目
     */
    private String jiaofeiName;


    /**
     * 缴费类型
     */
    private Integer jiaofeiTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 应缴金额
     */
    private Double jiaofeiYingjiaoMoney;


    /**
     * 实收金额
     */
    private Double jiaofeiShishouMoney;


    /**
     * 备注
     */
    private String jiaofeiContent;


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
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：缴费名目
	 */
    public String getJiaofeiName() {
        return jiaofeiName;
    }


    /**
	 * 设置：缴费名目
	 */
    public void setJiaofeiName(String jiaofeiName) {
        this.jiaofeiName = jiaofeiName;
    }
    /**
	 * 获取：缴费类型
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 设置：缴费类型
	 */
    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：应缴金额
	 */
    public Double getJiaofeiYingjiaoMoney() {
        return jiaofeiYingjiaoMoney;
    }


    /**
	 * 设置：应缴金额
	 */
    public void setJiaofeiYingjiaoMoney(Double jiaofeiYingjiaoMoney) {
        this.jiaofeiYingjiaoMoney = jiaofeiYingjiaoMoney;
    }
    /**
	 * 获取：实收金额
	 */
    public Double getJiaofeiShishouMoney() {
        return jiaofeiShishouMoney;
    }


    /**
	 * 设置：实收金额
	 */
    public void setJiaofeiShishouMoney(Double jiaofeiShishouMoney) {
        this.jiaofeiShishouMoney = jiaofeiShishouMoney;
    }
    /**
	 * 获取：备注
	 */
    public String getJiaofeiContent() {
        return jiaofeiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setJiaofeiContent(String jiaofeiContent) {
        this.jiaofeiContent = jiaofeiContent;
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
