package com.sqlhero.small;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * 启动类
 * @date 2020/8/20 17:10
 * @author sqlhero
 * @version 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.sqlhero.small.mapper"})
public class SmallApplication {

    public static void main(String[] args) throws InterruptedException {
        // SpringApplication.run(SmallApplication.class, args);

        // 非web环境启动
        SpringApplication application = new SpringApplication(SmallApplication.class);
        // 如果是web环境，默认创建AnnotationConfigEmbeddedWebApplicationContext，因此要指定applicationContextClass属性
        application.setApplicationContextClass(AnnotationConfigApplicationContext.class);
        application.run(args);

        // 如果不想让spring容器退出，可以使用以下代码
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
