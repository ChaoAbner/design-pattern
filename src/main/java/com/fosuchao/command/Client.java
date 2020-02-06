package com.fosuchao.command;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 17:17
 */
public class Client {
    public static void main(String[] args) {
        LightOffCommand lightOffCommand = new LightOffCommand();
        LightOnCommand lightOnCommand = new LightOnCommand();

        // 初始化一组开关命令，如果其它命令，比如开关电视，则初始化多几组按钮
        Controller controller = new Controller(1);
        // 设置灯开关命令
        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.pushOnButton(0);
        controller.pushOffButton(0);
        controller.pushOffButton(1);
        // 继续添加命令。。。
    }
}
