package DataStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package DataStructure;

/**
 *
 * @author asus
 */
public class Linkedlist1 {
Node head;

 static class Node{
     int data;
    Node next;
    Node(int d){
    data=d;
    next=null;
    }
}
 
 public void printlist(){
 Node n=head;
 while(n!=null){
 System.out.print(n.data+ "  ");
 n=n.next;}
 }
 
 public static void main(String[] args){
 Linkedlist1 list=new Linkedlist1();
 
 list.head=new Node(1);
 Node Second=new Node(3);
 Node third=new Node(2);
 
 list.head.next=Second;
 Second.next=third;
 
 list.printlist();
 
 
 }
 
    
}
