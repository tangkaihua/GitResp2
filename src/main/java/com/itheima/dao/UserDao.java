package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author tangkaihua
 * @create 2020-05-30-11:16
 */
@Mapper
public interface UserDao {
    public List<User> queryUserList();
}
