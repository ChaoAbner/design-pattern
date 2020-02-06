package com.fosuchao.command;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 17:05
 */
public class LightOffCommand implements Command{
    @Override
    public void execute() {
        System.out.println("关闭灯光");
    }

    @Override
    public void undo() {
        System.out.println("维持灯光开启状态");
    }
}
