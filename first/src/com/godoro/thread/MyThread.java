package com.godoro.thread;

public class MyThread extends Thread{
    
    @Override
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
