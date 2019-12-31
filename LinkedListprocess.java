/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package DataStructure;
import java.util.*;

/**
 *
 * @author asus
 */
public class LinkedListprocess {
    public static void main(String[] args){
    LinkedList<String> Llist=new LinkedList<String>();
    Llist.add("A");
    Llist.add("B");
    Llist.addLast("Z");
    Llist.addFirst("M");
    Llist.add(3,"C");
    System.out.print("LinkedList is:"+Llist);
    
    Llist.remove("A");
    System.out.println();
    System.out.print("New LinkedList is:"+Llist);
    Llist.removeLast();
    System.out.println();
    System.out.print("After removing last LinkedList is:"+Llist);
    Collections.reverse(Llist);
    System.out.println();
    System.out.print("After reversing LinkedList is:"+Llist);
    }
}
