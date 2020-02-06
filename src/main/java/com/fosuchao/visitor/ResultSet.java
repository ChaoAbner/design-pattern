package com.fosuchao.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/6 19:18
 */
public class ResultSet {
    private List<Person> result = new ArrayList<>();

    public void add(Person person) {
        result.add(person);
    }

    public boolean remove(Person person) {
        return result.remove(person);
    }

    public void display(Action action) {
        for (Person person : result) {
            person.accept(action);
        }
    }
}
