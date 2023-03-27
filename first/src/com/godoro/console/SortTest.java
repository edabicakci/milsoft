package com.godoro.console;

import java.util.List;
import static java.util.List.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {
    public static void main(String[] args) {
        List list = of(1,2,3,4);

        // ... args isetediğimiz kadar

    //List<int> integers = new ArrayList<int>();
    List<Integer> integers = new ArrayList<Integer>();
    //integers.add(Integer.valueOf(0))
    integers.add(3);
    integers.add(8);
    integers.add(7);
    integers.add(6);
    integers.add(5);



    Collections.sort(integers);
    System.out.println(integers);

    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2){
            return o2-o1;
        }
        
    };

    Collections.sort(integers,comparator);
    System.out.println(integers);

    Collections.sort(integers,Collections.reverseOrder(comparator));
    System.out.println(integers);
    

    integers.sort(comparator);

        
    }

    
}
