package com.education.hszg.structures.api;

public interface IntegerStorage {

    void init();
    void clear();
    int getSize();

    void add(int element);
    void add(int element, int position);

    int remove();
    int remove(int position);

    int get();
    int get (int position);

}
