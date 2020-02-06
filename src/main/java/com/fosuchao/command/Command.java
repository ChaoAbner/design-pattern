package com.fosuchao.command;

public interface Command {
    // 执行命令
    void execute();
    // 空命令
    void undo();
}
