package com.fosuchao.chain;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/10 10:39
 */
public class DebugLogger extends AbstractLogger {
    public DebugLogger() {
        this.level = DEBUG;
        this.nextLogger = new InfoLogger();
    }

    @Override
    protected void write(String message) {
        System.out.println("Logger::DEBUG -> " + message);
    }
}
