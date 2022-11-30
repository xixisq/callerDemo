package com.ccnu.eldercare.model.infrared;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ccnu.eldercare.model.base.BaseEnity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author ganccl
 * @create 2022-11-30 19:34
 */
@Data
@ApiModel
@TableName("infrared")
public class Infrared extends BaseEnity {

    private static final long serialVersionUID = 1L;



    private long id;

    @ApiModelProperty(value = "IMEI")
    @TableField("imei")
    private String imei;

    @ApiModelProperty(value = "用户ID")
    @TableField("user_id")
    private long user_id;

    @ApiModelProperty(value = "设备类型")
    @TableField("devicetype")
    private String devicetype;



}
