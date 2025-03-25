package com.education.hszg.structures.impl;

import com.education.hszg.structures.api.NoDirectAccessIntegerStorage;

import java.util.ArrayList;
import java.util.List;

public class IntegerStack implements NoDirectAccessIntegerStorage {
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
        return data.get(data.size()-1);
    }

    @Override
    public Integer pop() {
        return data.remove(data.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

}
