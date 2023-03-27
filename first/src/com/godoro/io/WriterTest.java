package com.godoro.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
public class WriterTest {
    public static void main(String[] args){
        
        /*BufferedWriter writer = null;

        try {

            String path = "/Users/edabicakci/Desktop/private/milsoft/workspace/first/src/com/godoro/out.txt";
        FileWriter fw = new FileWriter(path);
        writer = new BufferedWriter(fw);

        writer.write("HTML");
        writer.write("JS");
        writer.write("CSS");
        writer.write("Ajax");

       
            
        } catch (Exception e) {
            // TODO: handle exception

            // boş bırakırsan java da yakalayamıyo o yüzden boş bırakma
            System.out.println("Yanlışlık oldu" );
            e.printStackTrace();
        }finally{

            if(writer != null){
                try {
                    writer.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
           

        }


        


    }*/



    String path = "/Users/edabicakci/Desktop/private/milsoft/workspace/first/src/com/godoro/out.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path)) ){
            //close olayını kendi yapıyo çnkü extends Closable
       

        writer.write("HTML");
        writer.write("JS");
        writer.write("CSS");
        writer.write("Ajax");
        

       
            
        } catch (Exception e) {
            // TODO: handle exception

            // boş bırakırsan java da yakalayamıyo o yüzden boş bırakma
            System.out.println("Yanlışlık oldu" );
            e.printStackTrace();
        }


        


    }
    
}
