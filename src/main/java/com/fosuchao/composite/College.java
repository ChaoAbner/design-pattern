package com.fosuchao.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/5 18:20
 */
public class College extends Component{
    private String name;
    private String desc;
    private List<Component> list = new ArrayList<>();


    public College(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    public List<Component> getList() {
        return this.list;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    protected void print() {
        for (Component component : this.list) {
            System.out.println(component.toString());
        }
        System.out.println();
    }
}
