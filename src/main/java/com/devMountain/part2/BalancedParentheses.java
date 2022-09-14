package com.devMountain.part2;

import java.util.*;

public class BalancedParentheses {

    public static void main(String[] args) {

//        System.out.println(balancedParentheses("This ( is unbalanced."));
//        System.out.println(balancedParentheses("(This (is (a) balanced) string.)"));
//        System.out.println(balancedParentheses( "This is () also ) unbalanced."));
//        System.out.println(balancedParentheses("Balanced."));
//        System.out.println(balancedBrackets("(){}[]<>]{"));
//        System.out.println(balancedBrackets(" <({)}>"));
        System.out.println(balancedBrackets(")("));


//        System.out.println(balancedBrackets( "This is () also ) unbalanced."));

//        System.out.println(balancedBracketsQueue( "This is () also ) unbalanced."));
    }
// Step 1
    public static boolean balancedParentheses(String string) {
         int noOfUnOpenClosedParenthesis=0;
         for(int i =0; i< string.length() ; i++){
             if(string.charAt(i) == '('){
                 noOfUnOpenClosedParenthesis += 1;

             } else if(string.charAt(i) == ')'){
                 noOfUnOpenClosedParenthesis -= 1 ;
             }
         }
         if(noOfUnOpenClosedParenthesis == 0){
             return true;
         }
         return false;

    }





    public static boolean balancedBrackets(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i += 1) {

            // If character is opening bracket
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt(i));
                System.out.println("first if " + s.charAt(i));
            }
            // Else, if character is closing bracket
            else if (bracketPairs.containsKey(s.charAt(i))) {
                // Closing bracket without matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                System.out.println("first if " + s.charAt(i));
                // Check that most recent bracket on stack matches
                Character mostRecentBracket = stack.pop();
                if (!mostRecentBracket.equals(bracketPairs.get(s.charAt(i)))) {
                    System.out.println("second if " + s.charAt(i));
                    System.out.println(mostRecentBracket);
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    //implemented using Queue
    public static boolean balancedBracketsQueue(String string){
        Queue<Character> queue = new LinkedList<>() ;

        HashMap<Character, Character> bracketPair = new HashMap<Character, Character>();
        bracketPair.put('(',')');
        bracketPair.put('{','}');
        bracketPair.put('[',']');
        bracketPair.put('<','>');

        for(int i = 0; i < string.length(); i++) {
            if(bracketPair.containsValue(string.charAt(i))){
                queue.add(string.charAt(i));
            } else if( bracketPair.containsKey(string.charAt(i))){
                if(queue.isEmpty()){
                    return false;
                }
                Character poppedChar = queue.remove();
                if(!poppedChar.equals(bracketPair.get(string.charAt(i)))){
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}





//What is the runtime complexity of your solutions for Step 1 and Step 2?
//  run time for balancedParentheses and balancedBrackets is O(n) i.e linear


//What is the runtime complexity for each solution?
// O(n)


//How do the solutions compare to yours? What improvements do you think you could have made to your solution?
//


//How would the implementation of the Stack from Step 3 change if you were to implement a queue?


// as we are adding items in back of queue and removing the item from front of queue, implementation will change in add and remove method