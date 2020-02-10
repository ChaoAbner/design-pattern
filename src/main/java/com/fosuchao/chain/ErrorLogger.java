package com.fosuchao.chain;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/10 10:39
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        this.level = ERROR;
        this.nextLogger = new DebugLogger();
    }

    @Override
    protected void write(String message) {
        System.out.println("Logger::ERROR -> " + message);
    }
}
