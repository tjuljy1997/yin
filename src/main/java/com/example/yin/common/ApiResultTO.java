package com.example.yin.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ApiResultTO {

    @ApiModelProperty(value = "是否操作成功", required = true, example = "true")
    private boolean success;

}
