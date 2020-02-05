package com.fosuchao.composite;

/**
 * @Description: 组合模式
 * @Auther: Joker Ye
 * @Date: 2020/2/5 18:25
 */
public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学", "全国顶尖大学之一");

        Component electric = new College("电气工程学院", "拉电线的");
        Component electronic = new College("电子工程学院", "修空调的");
        Component computer = new College("计算机科学学院", "拉网线的");

        Component automation = new Department("自动化", "弱电");
        Component electricMap = new Department("电网", "强电");
        Component connection = new Department("物联网", "万物互联");
        Component robot = new Department("微电子", "机器人");
        Component network = new Department("网络工程", "学习网络掉头发");
        Component soreware = new Department("软件工程", "开发软件的");

        electric.add(automation);
        electric.add(electricMap);
        electronic.add(connection);
        electronic.add(robot);
        computer.add(network);
        computer.add(soreware);
        university.add(electric);
        university.add(electronic);
        university.add(computer);

        System.out.println(university.toString());
        for (Component component : university.getList()) {
            System.out.println(component.toString());
            component.print();
        }
    }
}
