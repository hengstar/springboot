package com.zjiang.springboot.controller;

import com.zjiang.springboot.dto.ResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@Api(tags = "HelloWord接口")
@RestController
// @EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    @ApiOperation("hello word")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    public String hello() {
        return "hello word";
    }

    @RequestMapping("/getUser")
    public ResponseDto getuser() {
        ResponseDto responseDto = new ResponseDto();

        return responseDto;
    }
    /**可以使用@EnableAutoConfiguration注解直接启动服务，建议使用的是@SpringBootApplication注解去实现，编写一个启动类
     
     public static void main(String[] args) {
         SpringApplication.run(HelloController.class, args);
     }*/
}
