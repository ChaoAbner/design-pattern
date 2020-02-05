package com.fosuchao.flyweight;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 20:00
 */
public class CloudServer implements Server {
    private String useType;

    public CloudServer(String useType) {
        this.useType = useType;
    }

    @Override
    public void use(User user) {
        System.out.println(user.getName() + "使用云服务器搭建了" + useType + "服务");
    }
}
