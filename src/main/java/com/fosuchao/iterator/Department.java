package com.fosuchao.iterator;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/7 19:38
 */
public class Department {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Department{" +
                "学院名='" + name + '\'' +
                "职业 ='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
