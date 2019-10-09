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
public class Rabbit extends Thread {

    volatile String name;
    volatile  int i;

    public Rabbit(String name) {
        this.name = name;
    }

   synchronized  public void run() {   
        
            for (int i = 0; i < 10; i++) {
                System.out.println(name + "-" + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
       
        System.out.println("DONE!");
    }
}
