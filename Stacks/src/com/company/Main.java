package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 2567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Bill", "End", 78));

//        stack.printStack();
//        System.out.println(stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println(stack.peek());
    }
}
