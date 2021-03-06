package com.zbais.mall.modules.ums.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 修改用户名密码参数
 * @author Zbais
 * create on: 2022/1/31
 */
@Data
public class UpdateAdminPasswordParam {
    @NotEmpty
    @ApiModelProperty(value = "用户名", required = true)
    private String username;
    @NotEmpty
    @ApiModelProperty(value = "旧密码", required = true)
    private String oldPassword;
    @NotEmpty
    @ApiModelProperty(value = "新密码",required = true)
    private String newPassword;
}
