package com.after00.netty;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"com.after00.netty.server"})
public class NettyServerApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
       SpringApplication.run(NettyServerApp.class);
    }
}
