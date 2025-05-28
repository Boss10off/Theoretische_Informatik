package com.education.hszg.thi.turing;

import java.util.ArrayList;
import java.util.List;

public class CharStackImplementation implements CharStack {

    List<Character> stack = new ArrayList<>();

    @Override
    public void init() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(char element) {
        stack.add(0,element);
    }

    @Override
    public Character top() {
        return stack.get(0);
    }

    @Override
    public Character pop() {
        return stack.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
