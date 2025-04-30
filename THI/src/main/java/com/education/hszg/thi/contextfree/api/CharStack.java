package com.education.hszg.thi.contextfree.api;

public interface CharStack {
    void init();
    void push(Character element);
    Character top();
    Character pop();
    boolean isEmpty();
}
