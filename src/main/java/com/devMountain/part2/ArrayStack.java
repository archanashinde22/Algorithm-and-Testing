package com.devMountain.part2;

import java.util.EmptyStackException;

public class ArrayStack {
    private String[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new String[capacity];
    }
    public void push(String s){
        if(top == stack.length){
            String[] newArray= new String[2*stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = s;
//        System.out.println(top);
    }

    public String pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top == 0;

    }
    public int size(){
        return top;
    }
}
