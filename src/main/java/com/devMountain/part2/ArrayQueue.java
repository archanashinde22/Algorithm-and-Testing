package com.devMountain.part2;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueue {
    private String[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new String[capacity];
    }

    public void add(String employee) {
        if (back == queue.length) {
            String[] newArray = new String[2 * queue.length];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public String remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        String s = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return s;
    }

    public String peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        return back - front;
    }

    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
