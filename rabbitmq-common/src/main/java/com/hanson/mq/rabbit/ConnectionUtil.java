package com.hanson.mq.rabbit;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
    /**
     * 连接RabbitMQ 服务器
     *
     * @return 连接
     * @throws Exception 异常信息
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("172.21.65.53");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("/");
        factory.setUsername("hanson");
        factory.setPassword("hanson");
        // 通过工程获取连接
        return factory.newConnection();
    }
}
