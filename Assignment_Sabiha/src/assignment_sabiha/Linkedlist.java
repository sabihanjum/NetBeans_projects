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
public class Linkedlist {
class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
class LinkedList {
        Node head;

        public LinkedList() {
            this.head = null;
        }
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
public void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
public void remove(int data) {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            if (head.data == data) {
                head = head.next;
                return;
            }

            Node temp = head;
            while (temp.next != null && temp.next.data != data) {
                temp = temp.next;
            }

            if (temp.next == null) {
                System.out.println("Element not found");
            } else {
                temp.next = temp.next.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist outer = new Linkedlist();
        LinkedList list = outer.new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Linked List after additions:");
        list.display();

        list.remove(20);

        System.out.println("Linked List after removal:");
        list.display();
    }
}

