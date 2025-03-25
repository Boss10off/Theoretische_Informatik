package com.education.hszg.structures.impl;

import com.education.hszg.structures.api.IntegerStorage;

public class ArrayIntegerStorage implements IntegerStorage {

    private int[] data = new int[2];
    private int nrOfElements = 0;

    @Override
    public void init() {
        data = new int[2];
        nrOfElements = 0;
    }

    @Override
    public void clear() {
        data = new int[2];
        nrOfElements = 0;
    }

    @Override
    public int getSize() {
        return nrOfElements;
    }

    @Override
    public void add(int element) {
        if (nrOfElements < data.length) {
            data[nrOfElements] = element;
            nrOfElements++;
        }
        else {
            int[] newData = new int[data.length + 2];
            for(int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
            add(element);
        }
    }

    @Override
    public void add(int element, int position) {
        if (nrOfElements < data.length) {
            for(int i = data.length - 1; i > position; i--) {
                data[i] = data[i-1];
            }
            data[position] = element;
            nrOfElements++;
        }
        else {
            int[] newData = new int[data.length + 2];
            for(int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
            add(element, position);
        }
    }

    @Override
    public int remove() {
        int temp = data[0];
        nrOfElements--;
        for (int i = 0; i < nrOfElements; i++) {
            data[i] = data[i+1];
        }
        return temp;
    }

    @Override
    public int remove(int position) {
        int temp = data[position];
        nrOfElements--;
        for (int i = position; i < nrOfElements; i++) {
            data[i] = data[i+1];
        }
        return temp;
    }

    @Override
    public int get() {
        return data[0];
    }

    @Override
    public int get(int position) {
        return data[position];
    }
}
