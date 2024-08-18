package com.tantt.chatmall.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author zhongzb
 * @date 2021/05/27
 */
// ,exclude = {RocketMQAutoConfiguration.class}
@SpringBootApplication(scanBasePackages = {"com.tantt.chatmall"})
// @MapperScan({"com.abin.mallchat.common.**.mapper"})
// @ServletComponentScan
public class MallchatCustomApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallchatCustomApplication.class,args);
    }

}