package com.fosuchao.command;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 17:12
 */
public class UndoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("空执行");
    }

    @Override
    public void undo() {
        System.out.println("空执行");
    }
}
