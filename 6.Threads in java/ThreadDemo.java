/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sayone
 */
class Hi extends Thread{
    
    public  void run(){
        for(int i=0;i<3;i++){
            System.out.println("hai");
            try { Thread.sleep(500);} catch(InterruptedException ex) {}
        }
    }
}
class Hello extends Thread{
    
     public  void run(){
        for(int i=0;i<3;i++){
            System.out.println("hello");
            try { Thread.sleep(500);} catch(InterruptedException ex) {}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Hello obj1=new Hello();
        Hi obj2 = new Hi();
        
        obj1.start();
        obj2.start();
        //obj1.run();
        //obj2.run();
    }
}
