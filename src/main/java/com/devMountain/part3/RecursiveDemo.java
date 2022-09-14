package com.devMountain.part3;

public class RecursiveDemo {

    public static void main(String[] args) {
        int[] oneToTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(recursive_search(oneToTen, 7));

        // Example where it is not found
        System.out.println(recursive_search(oneToTen, 0));
    }
    public static int recursive_search(int[] intArr, int num){
       return recursive_search(intArr,num,0);
    }
    public static int recursive_search(int[] intArr, int num, int index){
        if (index==intArr.length){
            return -1;
        }
        if(num == intArr[index])
        {
            return index;
        }
        return recursive_search(intArr , num, index+1);
    }

}
//Run time Complexity O(n)