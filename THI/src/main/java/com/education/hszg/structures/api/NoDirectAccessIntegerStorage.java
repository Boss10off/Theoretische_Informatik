package com.education.hszg.structures.api;

public interface NoDirectAccessIntegerStorage {
    void init();
    void push(Integer element);
    Integer top();
    Integer pop();
    boolean isEmpty();
}
