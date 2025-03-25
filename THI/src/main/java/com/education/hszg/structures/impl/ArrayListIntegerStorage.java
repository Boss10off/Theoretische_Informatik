package com.education.hszg.structures.impl;
import com.education.hszg.structures.api.IntegerStorage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntegerStorage implements IntegerStorage {
    private List<Integer> data = new ArrayList<>();

    @Override
    public void init() {
        data = new ArrayList<>();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public void add(int element) {
        data.add(element);
    }

    @Override
    public void add(int element, int position) {
        data.add(position, element);
    }

    @Override
    public int remove() {
        return data.remove(0);
    }

    @Override
    public int remove(int position) {
        return data.remove(position);
    }

    @Override
    public int get() {
        return data.get(0);
    }

    @Override
    public int get(int position) {
        return data.get(position);
    }
}
