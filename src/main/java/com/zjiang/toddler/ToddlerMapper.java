package com.zjiang.toddler;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ToddlerMapper {
    @Select("select t.Hexagrams_names HexagramsNames,t.guaci,t.inference from toddler t where t.toddler=#{toddler}")
    Toddler selectByToddler(@Param("toddler") String toddler);

}
