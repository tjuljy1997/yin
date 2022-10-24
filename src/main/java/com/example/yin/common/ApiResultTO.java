package com.example.yin.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiResultTO<T extends Serializable> extends BaseTO{


    @ApiModelProperty(value = "是否操作成功", required = true, example = "true")
    private boolean success;

    //错误码
    @ApiModelProperty(value = "错误码", required = true, example = "0001")
    private Integer errorCode;

    //错误提示
    @ApiModelProperty(value = "错误提示", required = true, example = "系统错误")
    private String message;

    //操作结果
    @ApiModelProperty(value = "操作结果", required = true)
    private T data;





}
