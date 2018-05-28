package com.xiaoyu.repository;

import com.xiaoyu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-28 16:24
 **/
public interface UserRepository extends JpaRepository<User,Integer> {
}
