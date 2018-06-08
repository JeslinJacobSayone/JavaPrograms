/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author sayone
 */
class Boy implements Runnable{
    
    @Override
    public synchronized void run(){
        for(int i=0;i<3;i++){
            System.out.println("hey boy...");
            try { Thread.sleep(500);} catch(InterruptedException ex) {}
        }
    }
}
class Girl implements Runnable{
    
    @Override
    public synchronized void run(){
        for(int i=0;i<3;i++){
            System.out.println("hey Girl...");
            try { Thread.sleep(500);} catch(InterruptedException ex) {}
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        
        Boy boy = new Boy();
        Girl girl = new Girl();
        
        Thread t1= new Thread(boy);
        Thread t2= new Thread(girl);
        
        t1.start();
        t2.start();
    }
}
