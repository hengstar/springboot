package com.zjiang.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.zjiang.springboot.dto.UserPlus;
import com.zjiang.springboot.mapper.UserPlusMapper;
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
@Service
public class UserPlusServiceImpl implements IUserPlusService {

    @Autowired(required = false)
    UserPlusMapper usermapper;

    @Override
    public UserPlus selectById(Integer id) {
        return usermapper.selectById(id);
    }

    @Override
    public void insert(String name, String sex) {
        UserPlus plus = new UserPlus();
        plus.setName(name);
        plus.setSex(sex);
        usermapper.insert(plus);
    }

    @Override
    public void update(String name, Integer id) {
        UserPlus plus = new UserPlus();
        plus.setName(name);
        plus.setId(id);
        usermapper.updateById(plus);

    }

    @Override
    public void delete(Integer id) {
        usermapper.deleteById(id);
    }

    @Override
    public List<UserPlus> selectPage(Integer pagenum, Integer size) {
        Wrapper<UserPlus> wrapper = new EntityWrapper<UserPlus>();
        Page<UserPlus> page = new Page<UserPlus>((pagenum - 1) * size, size);

        return usermapper.selectPage(page, wrapper);
    }
}
