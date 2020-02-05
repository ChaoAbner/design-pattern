package com.fosuchao.flyweight;

import java.io.Serializable;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:00
 */
public class VisualServer implements Server {
    private String useType;

    public VisualServer(String useType) {
        this.useType = useType;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + "使用虚拟机搭建了" + useType + "服务");
    }
}
