package com.zjiang.springboot.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 
 * <p>标题: </p>
 * <p>功能描述: </p>
 *       
 * <p>版权: 税友软件集团股份限公司</p> 
 * <p>创建时间: 2018年5月6日,下午6:21:19</p> 
 * <p>作者：zjiang</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 */
@Data
@ApiModel

public class User {
    @ApiModelProperty(value = "用户id")
    private int id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户地址")
    private String sex;

}
