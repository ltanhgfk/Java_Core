/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

/**
 *
 * @author TEACHER
 */
public class DemoThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Rabbit("Tho");
        Thread t2 = new Rabbit("Rua");
        t1.setName("tho");
        t2.setName("rua");
//         //Runnable r = new Turtle("Rua");
//        Thread t2 = new Thread(new Turtle());
//        t2.setName("Rua");
//        t1.start();
//        t2.start();
        
        t1.start();
        //t1.join();
        t2.start();


    }
    
}
