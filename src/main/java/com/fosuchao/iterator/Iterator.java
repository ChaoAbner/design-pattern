package com.fosuchao.iterator;

public interface Iterator {
    void remove(Object object);
    Object next();
    Boolean hasNext();
}
