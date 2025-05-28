package com.education.hszg.thi.contextfree.api;


public interface StringStack {
    void init();
    void push(String element);
    String top();
    String pop();
    boolean isEmpty();
}


