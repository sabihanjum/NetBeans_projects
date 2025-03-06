/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment_sabiha;

/**
 *
 * @author drsab
 */
public class Stack {

    static class SimpleStack { // Made SimpleStack a static inner class
        private int[] stack;
        private int top;
        private int capacity;

        public SimpleStack(int size) {
            stack = new int[size];
            capacity = size;
            top = -1; // Stack is initially empty
        }

        // Push an element onto the stack
        public void push(int data) {
            if (top == capacity - 1) {
                System.out.println("Stack is full. Cannot push " + data);
                return;
            }
            stack[++top] = data; // Increment top and add data
            System.out.println(data + " pushed to stack");
        }

        // Pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            return stack[top--]; // Return top element and decrement top
        }

        // Peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1;
            }
            return stack[top]; // Return top element
        }

        // Check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5); // Create a stack of capacity 5

        stack.push(10);
        stack.push(20);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after popping: " + stack.peek());
    }
}

