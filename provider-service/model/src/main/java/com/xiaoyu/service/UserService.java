package com.xiaoyu.service;

import com.xiaoyu.entity.User;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-28 16:20
 **/
public interface UserService {

    /**
     *
     * @param user
     * @return User
     */
    public User createUser(User user);

    /**
     *
     * @param id
     */
    public void  deleteUserById(Integer id);

    /**
     *
     * @param id
     * @return User
     */
    public User getUserById(Integer id);

    /**
     *
     * @param user
     * @return User
     */
    public User updateUser(User user);
}
