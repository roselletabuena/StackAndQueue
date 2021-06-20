package com.company;

import java.util.LinkedList;
import java.util.Queue;

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
//        LinkedList<Character> stack = new LinkedList<>();
//        Queue<Character> queue = new LinkedList<>();
//
//        String lowercaseInput = string.toLowerCase();
//
//        for (int i = 0; i < lowercaseInput.length(); i++) {
//            char c = lowercaseInput.charAt(i);
//            if(c >= 'a' && c <= 'z') {
//                stack.push(c);
//                queue.add(c);
//            }
//        }
//
//        StringBuilder reversedString = new StringBuilder(string.length());
//        StringBuilder input = new StringBuilder(string.length());
//
//
//        while (stack.size() > 0 && queue.size() > 0) {
//            reversedString.append(stack.pop());
//            input.append(queue.remove());
//        }
//        return reversedString.toString().equals(input.toString());
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if(c >= 'a' && c <= 'z') {
                queue.add(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if(!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
