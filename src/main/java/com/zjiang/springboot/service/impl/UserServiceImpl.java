package com.zjiang.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjiang.springboot.dto.User;
import com.zjiang.springboot.mapper.UserMapper;
import com.zjiang.springboot.service.IUserService;

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
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper usermapper;
    @Override
    public User selectById(Integer id) {
        return usermapper.selectbyid(id);
    }

    /*
     * (non-Javadoc)
     * @see com.zjiang.springboot.service.IUserService#insert(java.lang.String, java.lang.String)
     */
    @Override
    public void insert(String name, String sex) {
        usermapper.insert(name, sex);
    }

    /*
     * (non-Javadoc)
     * @see com.zjiang.springboot.service.IUserService#update(java.lang.String, java.lang.Integer)
     */
    @Override
    public void update(String name, Integer id) {
        usermapper.update(name, id);

    }

    /*
     * (non-Javadoc)
     * @see com.zjiang.springboot.service.IUserService#delete(java.lang.Integer)
     */
    @Override
    public void delete(Integer id) {
        usermapper.delete(id);
    }
}
