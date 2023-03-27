package com.godoro.thread;

public class MyRunnable implements Runnable{

    public void run() {
        // TODO Auto-generated method stub

        while(true){

            try {
                System.out.println("Koşuyor...");
                Thread.sleep(750);
                
            } catch (InterruptedException e) {
                // TODO: handle exception

                e.printStackTrace();
            }
        }
        
    }
}
