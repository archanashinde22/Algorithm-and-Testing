package com.devMountain.part3;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println(sumOfLinkedList(list1,list2));

    }

    public static LinkedList<Integer> sumOfLinkedList(LinkedList<Integer> list1 , LinkedList<Integer> list2){

        System.out.println(list1);
        System.out.println(list2);
        Iterator<Integer> iterator1 = list1.descendingIterator();
        int num1 = 0;

        int unit = 1;
        while(iterator1.hasNext())
        {
            num1 += unit * iterator1.next();
            unit *=10;
        }
        System.out.println("num1 :" +num1 );
        Iterator<Integer> iterator2 = list2.descendingIterator();
        int num2 = 0;
        unit = 1;
        while(iterator2.hasNext())
        {
            num2 += unit * iterator2.next();
            unit *=10;

        }
        System.out.println("num2 :" +num2 );

        int sum = num1 + num2;
        System.out.println("sum :" + sum);
        String s = String.valueOf(sum);

        LinkedList<Integer> sumList = new LinkedList<>();
        for(int i = 0; i<s.length();i++){
            sumList.add(Integer.parseInt( s.split("")[i]));
        }

        return sumList;
    }

}



//What is the runtime of this function?    --- O(n)