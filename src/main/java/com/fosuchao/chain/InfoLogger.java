package com.fosuchao.chain;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/10 10:39
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.level = INFO;
        this.nextLogger = null;
    }

    @Override
    protected void write(String message) {
        System.out.println("Logger::INFO -> " + message);
    }
}
