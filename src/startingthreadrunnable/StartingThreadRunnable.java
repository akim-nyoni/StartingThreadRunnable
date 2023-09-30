/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package startingthreadrunnable;

/**
 *
 * @author Akim Nyoni
 */
class SingleThread implements Runnable {
    String threadName;
    public void run(){
        for(int img = 1; img <= 10; img++){
            System.out.println(img+ " Printed from Printer 1");
        }
    }

}

public class StartingThreadRunnable {

    public static void main(String[] args) {
        Runnable t = new SingleThread();
        Thread task = new Thread(t);
        task.start();
        
        for(int i = 1;i<=10;i++){
            System.out.println(i+ " Printed from Printer 2");
        }
    }
}