package com.zjiang.springboot.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjiang.springboot.dto.UserPlus;
import com.zjiang.springboot.service.IUserPlusService;

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
@RestController
public class MybatisPlusController {

    @Autowired
    IUserPlusService userPlusService;

    @RequestMapping("/selectbyid")
    public UserPlus select(@Param("id") Integer id) {
        return userPlusService.selectById(id);
    }

    @RequestMapping("/insertplus")
    public String insert(@Param("name") String name, @Param("sex") String sex) {
        userPlusService.insert(name, sex);
        return "success";
    }

    @RequestMapping("/updateplus")
    public String update(@Param("name") String name, @Param("id") Integer id) {
        userPlusService.update(name, id);
        return "success";
    }

    @RequestMapping("/deleteplus")
    public String delete(@Param("id") Integer id) {
        userPlusService.delete(id);
        return "success";
    }

    @RequestMapping("/selectpage")
    public List<UserPlus> selectpage(Integer pagenum, Integer size) {
        return userPlusService.selectPage(pagenum, size);
    }
}
