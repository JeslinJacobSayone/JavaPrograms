/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.*;
import java.util.Collection;

/**
 *
 * @author sayone
 */
public class CollectionDemo {
    
    public static void main(String[] args) {
        
         Collection  values = new ArrayList();
         values.add(3);
         values.add(4);
         values.add("hai...how r u ?");
//         
         Iterator i= values.iterator();
         
         while(i.hasNext()){
             System.out.println("value is : "+i.next());
         }
//         
         System.out.println("printing output with for each loop");
         
         for(Object j : values){
             System.out.println("value is : "+j);
         }
           
         
         System.out.println("using integer collection");
      
         Collection<Integer> val2 = new ArrayList<>();
         val2.add(2);
         val2.add(3);
         val2.add(4);
         
         for(int a : val2){
             System.out.println(" the integer collection : "+a);
         }
         
    }
   
    
}
