package com.fosuchao.interpreter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/9 22:35
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public Boolean interpret(String context) {
        if (context.contains(data))
            return true;
        return false;
    }
}
