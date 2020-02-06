package com.fosuchao.command;

import javax.sound.midi.Soundbank;

/**
 * @Description: 遥控器
 * @Auther: Joker Ye
 * @Date: 2020/2/6 17:07
 */
public class Controller {
    private Command [] onCommands;
    private Command [] offCommands;
    private int commandNum;

    public Controller(int commandNum) {
        // 根据按钮个数初始化按钮
        this.commandNum = commandNum;
        onCommands = new Command[commandNum];
        offCommands = new Command[commandNum];
        for (int i = 0; i < commandNum; i++) {
            this.offCommands[i] = this.onCommands[i] = new UndoCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        this.onCommands[index] = onCommand;
        this.offCommands[index] = offCommand;
    }

    public void pushOnButton(int index) {
        if (!this.validCommand(index)) {
            System.out.println("没有这个命令");
            return;
        }

        this.onCommands[index].execute();
    }

    public void pushOffButton(int index) {
        if (!this.validCommand(index)) {
            System.out.println("没有这个命令");
            return;
        }

        this.offCommands[index].execute();
    }

    private boolean validCommand(int index) {
        if (index >= commandNum) {
            return false;
        }
        return true;
    }
}
