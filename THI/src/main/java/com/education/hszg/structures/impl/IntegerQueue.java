package com.education.hszg.structures.impl;

import com.education.hszg.structures.api.NoDirectAccessIntegerStorage;

import java.util.ArrayList;
import java.util.List;

public class IntegerQueue implements NoDirectAccessIntegerStorage {
    List<Integer> data = new ArrayList<>();
    @Override
    public void init(){
        data = new ArrayList<>();
    }

    @Override
    public void push(Integer element) {
        data.add(element);
    }

    @Override
    public Integer top() {
        return data.get(0);
    }

    @Override
    public Integer pop() {
        return data.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

}
