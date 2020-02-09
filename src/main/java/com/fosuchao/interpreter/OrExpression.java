package com.fosuchao.interpreter;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/9 22:36
 */
public class OrExpression implements Expression {
    Expression expr1 = null;
    Expression expr2 = null;

    OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
