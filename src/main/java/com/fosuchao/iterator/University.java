package com.fosuchao.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Auther: Joker Ye
 * @Date: 2020/2/7 19:37
 */
public class University implements Container {
    private List<Department> departments = new ArrayList<>();

    public University() {
        init();
    }

    private void init() {
        departments.add(new Department("电子信息工程", "电子工程师"));
        departments.add(new Department("电气工程及其自动化", "电气工程师"));
        departments.add(new Department("计算机科学与技术", "软件工程师"));
    }

    private class DepartmentsIterator implements Iterator {
        private Integer index = -1;

        @Override
        public void remove(Object object) {
            departments.remove(object);
        }

        @Override
        public Object next() {
            return departments.get(index);
        }

        @Override
        public Boolean hasNext() {
            boolean res = true;
            if (departments.size() == ++index)
                res = false;
            return res;
        }
    }

    @Override
    public Iterator getIterator() {
        return new DepartmentsIterator();
    }
}
