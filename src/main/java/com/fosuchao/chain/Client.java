package com.fosuchao.chain;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/10 10:43
 */
public class Client {
    public static AbstractLogger getLogger() {
        return new ErrorLogger();
    }

    public static void main(String[] args) {
        AbstractLogger logger = Client.getLogger();
        logger.logMessage(1, "配置信息");
        logger.logMessage(2, "配置警告");
        logger.logMessage(3, "配置错误");
    }
}
