package cn.layku.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dongdingzhuo
 * @Title: SimpleApplication
 * @Package cn.layku.simple
 * @Description: 启动类
 * @date 2020/4/20 17:43
 */
@SpringBootApplication
public class SimpleApplication implements CommandLineRunner {

    private static Logger logger = LoggerFactory.getLogger(SimpleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

    @Value("${spring.profiles.active}")
    private String active;

    @Value("${server.port}")
    private String port;


    @Override
    public void run(String... args) {
        logger.info("项目启动完成,当前环境->{},当前端口->{}", active, port);
    }
}
