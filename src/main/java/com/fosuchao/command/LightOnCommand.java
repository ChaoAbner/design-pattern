package com.fosuchao.command;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 17:05
 */
public class LightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("打开灯光");
    }

    @Override
    public void undo() {
        System.out.println("维持灯光关闭状态");
    }
}
