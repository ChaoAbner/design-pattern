package com.fosuchao.chain;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/10 10:34
 */
public abstract class AbstractLogger {
    protected int level;
    protected AbstractLogger nextLogger;

    public final static int INFO = 1;
    public final static int DEBUG = 2;
    public final static int ERROR = 3;

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
