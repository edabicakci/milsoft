package com.godoro.thread;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread =new MyThread();
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
