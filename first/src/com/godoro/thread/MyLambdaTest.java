package com.godoro.thread;

public class MyLambdaTest {
    

    public static void main(String[] args) {
        /* 
        
        Runnable runnable = () -> {



    work();

       
            
        };

        //Runnable runnable = () -> work();

        */
        Thread thread = new Thread(() -> work());

        //Thread thread = new Thread(runnable);
        thread.start();



        /*
         * new Thread(() -> work() ).start();
         *  
         */

        execute();


    }
       
        private static void execute(){
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


    private static void work(){

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
