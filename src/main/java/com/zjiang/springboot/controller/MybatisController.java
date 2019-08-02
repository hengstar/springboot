package com.zjiang.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zjiang.springboot.service.IUserService;

import lombok.extern.log4j.Log4j;

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
@Log4j
@RestController
@Transactional
public class MybatisController {

    @Autowired
    IUserService userService;

    @RequestMapping("/select")
    public Object selectById(Integer id) {
        return userService.selectById(id);
    }

    @RequestMapping("/insert")
    public Object insert(String name, String sex) {
        userService.insert(name, sex);
        return "success";
    }

    @RequestMapping("/update")
    public Object update(String name, Integer id) {
        userService.update(name, id);
        return "success";
    }

    @RequestMapping("/delete")
    public Object delete(Integer id) {
        userService.delete(id);
        return "success";
    }

    // 业务逻辑，先update再去delete
    @RequestMapping("/yewu")
    public Object yewu(String name, Integer id) {
        userService.update(name, id);
        log.debug("更新成功進入删除操作");
        int i = 2 / 0;
        userService.delete(id);
        log.debug("删除成功");
        return "success";
    }
}
