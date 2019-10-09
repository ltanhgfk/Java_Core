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
class A extends Thread {

    synchronized public void run() //run() is synchronized, i.e. synchronized run of multiple threads,
    {			       // A thread executing run() is not replaced by another thread
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String... ar) {
        //A ob = new A();

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.setName("aaa");
        t2.setName("bb");
        //Thread t3 = new Thread(ob, "ThreadC");	 //Calling Thread's constructor & passing the object of
        //A class that  implemented  Runnable interface &
        //the name of new thread.

        t1.start();
        t2.start();
        //t3.start();
    }
}
