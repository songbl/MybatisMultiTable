package com.sbl.dao;

import com.sbl.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 *
 * 可以后来创建----代理对象-----，用于数据库的操作
 */
public interface IUserDao {

    /**
     * 查询所有的数据
     * @return
     *
     * 可以使用注解的方式
     * @Seclct ("select *from user")
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     */
    User findById(int id);


    /**
     * 根据传入的参数条件查询
     * 查询条件，可能有用户名，可能有性别，可能有地址，还可能有其它
     */
    List<User>findUserByCondition(User user);


}
