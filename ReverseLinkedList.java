package DataStructure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package DataStructure;
import java.util.*;
import java.io.*;
/**
 *
 * @author asus
 */
public class ReverseLinkedList {
    public static void main(String[] args) throws IOException{
        LinkedList<String> Llist=new LinkedList<String>();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int i;
        String s[]=new String[5];
        System.out.println("Enter LinkedList Data:");
       for(i=0;i<5;i++){
     
        s[i]=br.readLine();
                }
      
         for(i=0;i<5;i++){
     
        Llist.add(i, s[i]);
                
         }
        System.out.print("Your LinkedList is:"+Llist +" ");
        //Using Built in Method
       // ->Collections.reverse(Llist);
        
        
        for(i=0;i<Llist.size()/2;i++) {
        String temp = Llist.get(i); 
            Llist.set(i, Llist.get(Llist.size() - i - 1)); 
            Llist.set(Llist.size() - i - 1, temp); 
         
        }
        
        
        
        System.out.println();
         System.out.print("After reverseing your LinkedList is:"+Llist +" ");
        
       
       
    
    }
   
    
   
    
   
    
}
