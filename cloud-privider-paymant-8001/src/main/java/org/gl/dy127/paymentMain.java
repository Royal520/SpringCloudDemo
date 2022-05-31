package org.gl.dy127;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.gl.dy127.dao")
public class paymentMain {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain.class,args);
    }
}
