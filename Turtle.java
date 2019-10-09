/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TEACHER
 */
public class Turtle implements Runnable{
//    String name;
//
//    public Turtle(String name) {
//        this.name = name;
//    }  
    
    
    @Override
    public synchronized void run() {
        for(int i=0;i<10;i++){
            //System.out.println(name+"-"+i);
            System.out.println(Thread.currentThread().getName()+"-"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("DONE!");
    }
}
