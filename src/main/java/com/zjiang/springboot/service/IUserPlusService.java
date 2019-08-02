package com.zjiang.springboot.service;

import java.util.List;

import com.zjiang.springboot.dto.UserPlus;


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

public interface IUserPlusService {

    UserPlus selectById(Integer id);

    void insert(String name, String sex);

    void update(String name, Integer id);

    void delete(Integer id);

    List<UserPlus> selectPage(Integer page, Integer size);
}
