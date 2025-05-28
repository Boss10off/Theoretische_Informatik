package com.education.hszg.thi.contextfree.impl;

import com.education.hszg.thi.contextfree.api.StringStack;

import java.util.ArrayList;
import java.util.List;

public class StringStackImplementation implements StringStack {
    List<String> list = new ArrayList<>();

    @Override
    public void init() {
        list = new ArrayList<>();
    }

    @Override
    public void push(String element) {
        list.add(0, element);
    }

    @Override
    public String top() {
        return list.get(0);
    }

    @Override
    public String pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
