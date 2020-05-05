package com.zjiang.toddler;

import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * description: Toddler <br>
 * date: 2020/4/17 21:00 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@Data
@ApiModel
@TableName("toddler")
public class Toddler {
    @ApiModelProperty(value = "卦名")
    private String HexagramsNames;
    @ApiModelProperty(value = "卦象")
    private String toddler;
    @ApiModelProperty(value = "卦辞")
    private String guaci;
    @ApiModelProperty(value = "推断")
    private String inference;
}
