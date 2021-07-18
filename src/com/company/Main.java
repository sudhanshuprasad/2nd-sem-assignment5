//Doubly linked list
package com.company;

import java.util.Scanner;
class node{
    protected int regd_no;
    protected float marks;
    protected node previous;
    protected node next;

    public void setStudent(){
        System.out.println("regd no\tmarks ");
        Scanner sc=new Scanner(System.in);
        regd_no= sc.nextInt();
        marks=sc.nextFloat();
    }
    public void displayStudent(){
        System.out.println("regd no "+regd_no+"\tmarks "+marks);
    }
}
public class Main {

    static node start=null;
    static node end=null;
    public static void create(){

        char ch;
        Scanner sc=new Scanner(System.in);
        do {
            node newNode = new node();
            newNode.previous = null;
            newNode.next = null;
            newNode.setStudent();
            if(start==null&&end==null) {
                start = newNode;
                end = newNode;
            }else {
                newNode.previous=end;
                newNode.next=null;
                end=newNode;
            }
//            System.out.println("check");
            System.out.println("add more?(y/n) ");
            ch=sc.next().charAt(0);
        }while (ch !='n'&&ch !='N');
    }

    public static void display(node start){
        node temp=start;
        while (temp!=null){
            temp.displayStudent();
            temp=temp.next;
        }
    }

    public static void insertAtEnd(node start){

    }

    public static void main(String[] args) {

//        node start=new node();
//        node end=new node();

        int choice;
        Scanner sc=new Scanner(System.in);
	    do{
	        System.out.println("0. Exit ");
	        System.out.println("1. Create ");
	        System.out.println("2. Display ");
	        System.out.println("3. Search ");
	        choice=sc.nextInt();
	        switch (choice){
                case 0:
                    break;
                case 1:
                    create();
                    break;
                case 2:
                    display(start);
                    break;
                default:
                    System.out.println("wrong choice ");
            }
        }while (choice!=0);
    }
}
