package com.entity.vo;

import com.entity.JiaofeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 缴费
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jiaofei")
public class JiaofeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 缴费名目
     */

    @TableField(value = "jiaofei_name")
    private String jiaofeiName;


    /**
     * 缴费类型
     */

    @TableField(value = "jiaofei_types")
    private Integer jiaofeiTypes;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 应缴金额
     */

    @TableField(value = "jiaofei_yingjiao_money")
    private Double jiaofeiYingjiaoMoney;


    /**
     * 实收金额
     */

    @TableField(value = "jiaofei_shishou_money")
    private Double jiaofeiShishouMoney;


    /**
     * 备注
     */

    @TableField(value = "jiaofei_content")
    private String jiaofeiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：缴费名目
	 */
    public String getJiaofeiName() {
        return jiaofeiName;
    }


    /**
	 * 获取：缴费名目
	 */

    public void setJiaofeiName(String jiaofeiName) {
        this.jiaofeiName = jiaofeiName;
    }
    /**
	 * 设置：缴费类型
	 */
    public Integer getJiaofeiTypes() {
        return jiaofeiTypes;
    }


    /**
	 * 获取：缴费类型
	 */

    public void setJiaofeiTypes(Integer jiaofeiTypes) {
        this.jiaofeiTypes = jiaofeiTypes;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：应缴金额
	 */
    public Double getJiaofeiYingjiaoMoney() {
        return jiaofeiYingjiaoMoney;
    }


    /**
	 * 获取：应缴金额
	 */

    public void setJiaofeiYingjiaoMoney(Double jiaofeiYingjiaoMoney) {
        this.jiaofeiYingjiaoMoney = jiaofeiYingjiaoMoney;
    }
    /**
	 * 设置：实收金额
	 */
    public Double getJiaofeiShishouMoney() {
        return jiaofeiShishouMoney;
    }


    /**
	 * 获取：实收金额
	 */

    public void setJiaofeiShishouMoney(Double jiaofeiShishouMoney) {
        this.jiaofeiShishouMoney = jiaofeiShishouMoney;
    }
    /**
	 * 设置：备注
	 */
    public String getJiaofeiContent() {
        return jiaofeiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setJiaofeiContent(String jiaofeiContent) {
        this.jiaofeiContent = jiaofeiContent;
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

}
