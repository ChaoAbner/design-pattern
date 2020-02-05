package com.fosuchao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 18:19
 */
public class Department extends Component {
    private String name;
    private String desc;

    public Department(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    protected void print() {

    }
}
