package com.xiaoyu;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: dubbodemo
 * @description:
 * @author: XiaoYu
 * @create: 2018-05-28 17:20
 **/
@SpringBootApplication
@EnableDubboConfiguration
public class ModelApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ModelApplication.class,args);
        //new CountDownLatch(1).await();
    }
}
