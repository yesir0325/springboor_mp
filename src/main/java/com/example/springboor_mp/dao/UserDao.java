package com.example.springboor_mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboor_mp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
