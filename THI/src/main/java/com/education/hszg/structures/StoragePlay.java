package com.education.hszg.structures;


import com.education.hszg.structures.api.IntegerStorage;
import com.education.hszg.structures.api.NoDirectAccessIntegerStorage;
import com.education.hszg.structures.impl.ArrayIntegerStorage;
import com.education.hszg.structures.impl.ArrayListIntegerStorage;
import com.education.hszg.structures.impl.IntegerQueue;
import com.education.hszg.structures.impl.IntegerStack;

public class StoragePlay {

    public static void main(String[] args) {
        //play with ArrayListStorage
        IntegerStorage storage = new ArrayListIntegerStorage();
        storage.add(1);
        storage.add(5);
        storage.add(3, 1);
        storage.remove();
        System.out.println("First element is " + storage.get(0));
        
        //play with ArrayStorage
        IntegerStorage storageLimited = new ArrayIntegerStorage();
        storageLimited.add(1);
        storageLimited.add(5);
        storageLimited.add(7);
        storageLimited.add(8);
        storageLimited.add(3, 1);
        storageLimited.remove();
        storageLimited.remove();
        System.out.println("First element is " + storageLimited.get(0));

        //play with StackStorage
        NoDirectAccessIntegerStorage myStack= new IntegerStack();
        myStack.init();
        myStack.push(3);
        myStack.push(4);
        myStack.push(77);
        myStack.push(5);
        myStack.pop();
        System.out.println("Next element is " + myStack.top());

        //play with QueueStorage
        NoDirectAccessIntegerStorage myQueue= new IntegerQueue();
        myQueue.init();
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(77);
        myQueue.push(5);
        myQueue.pop();
        System.out.println("Next element is " + myQueue.top());
    }
}
