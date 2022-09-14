package com.devMountain.part1;


import java.util.Arrays;


public class MissingNumber {


    public static void main(String[] args) {
            int[] numberList = {2, 1, 4, 3, 6, 5, 7,  9,8};

        System.out.println(missingNumber(numberList, 10 ));
        System.out.println(missingNumberSum(numberList, 10 ));
    }
    //Step 1  RUNtime Complexity O(n)  space complexity O(1)
    public static int missingNumber(int[] numberList, int maxValue) {

        Arrays.sort(numberList);

        if (numberList.length == maxValue && numberList[numberList.length - 1] == maxValue) {
            return 0;
        }
        for(int i=1; i < maxValue; i++){

                if(numberList[i-1] != i ){
                    return i;
                }
            }

        return maxValue;

    }
 //step 3   RUNtime Complexity O(n)  space complexity O(1)
    public static int missingNumberSum(int[] numberList, int maxValue) {

        int expectedSum =0;
        for(int i=1; i<=maxValue; i++){
            expectedSum +=i ;

        }

        return expectedSum - Arrays.stream(numberList).sum();
    }

}

