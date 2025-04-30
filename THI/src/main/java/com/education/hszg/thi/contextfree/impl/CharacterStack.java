package com.education.hszg.thi.contextfree.impl;

import com.education.hszg.thi.contextfree.api.CharStack;

import java.util.ArrayList;
import java.util.List;

public class CharacterStack implements CharStack {
    List<Character> data = new ArrayList<>();
    @Override
    public void init() {
        data = new ArrayList<>();
    }

    @Override
    public void push(Character element) {
        data.add(element);
    }

    @Override
    public Character top() {
        return data.get(data.size() - 1);
    }

    @Override
    public Character pop() {
        return data.remove(data.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
