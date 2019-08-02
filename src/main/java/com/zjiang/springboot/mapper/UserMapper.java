package com.zjiang.springboot.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.zjiang.springboot.dto.User;

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
@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{id}")
    User selectbyid(@Param("id") Integer id);

    @Insert("insert into user (name,sex) values(#{name},#{sex})")
    int insert(@Param("name") String name, @Param("sex") String sex);

    @Update("update user set name=#{name} where id=#{id}")
    int update(@Param("name") String name, @Param("id") Integer id);

    @Delete("delete from user where id=#{id}")
    int delete(@Param("id") Integer id);
}
