package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctation = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                stringNoPunctation.append(c);
                stack.push(c);
            }
        }

        StringBuilder reverseString = new StringBuilder(stack.size());

        while (!stack.isEmpty()) {
            reverseString.append(stack.pop());
        }

        return reverseString.toString().equals(stringNoPunctation.toString());

//        String newString = string.replaceAll("[^A-Za-z]+", "").toLowerCase();
//        char[] array = newString.toCharArray();
//
//        String reverseString = "";
//        for (int i = array.length; i > 0; i--) {
//            reverseString += array[i - 1];
//        }
//
//        return newString.equals(reverseString);
    }
}
