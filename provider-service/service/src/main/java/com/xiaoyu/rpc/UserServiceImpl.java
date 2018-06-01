package com.xiaoyu.rpc;

import com.alibaba.dubbo.config.annotation.Service;
import com.xiaoyu.entity.User;
import com.xiaoyu.repository.UserRepository;
import com.xiaoyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-28 16:27
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        if (id == null)
            throw new RuntimeException("userId is required!");
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Integer id) {
        if (id == null)
            throw new RuntimeException("userId is required!");
        User user=userRepository.getOne(id);
        return user;
    }

    @Override
    public User updateUser(User businessUser) {
        User user=userRepository.findFirstById(businessUser.getId());
        if (businessUser.getAge()!=null)
            user.setAge(businessUser.getAge());
        if (businessUser.getNickName()!=null)
            user.setNickName(businessUser.getNickName());
        user.setUpdateTime(new Date());
        return userRepository.save(user);
    }
}
