package com.fosuchao.interpreter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/9 22:32
 */
public interface Expression {
    Boolean interpret(String context);
}
