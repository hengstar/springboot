package com.zjiang.springboot.dto;

import java.util.Map;

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
public class ResponseDto {

    private boolean success;

    private String code;

    private String message;

    private Map<String, Object> response;


}
