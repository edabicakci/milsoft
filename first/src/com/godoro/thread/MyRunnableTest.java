package com.godoro.thread;

public class MyRunnableTest {

    public static void main(String[] args) {
        MyRunnable runnable =new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
       

        while(true){

            try {
                System.out.println("Sürüyor...");
                Thread.sleep(500);
                
            } catch (InterruptedException e) {
                // TODO: handle exception

                e.printStackTrace();
            }
        }

    }
    
}
