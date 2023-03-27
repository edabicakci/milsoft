package com.godoro.console;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 1234;
        String s = Integer.toString(i);

        long l = 1234;
        String s1 = Long.toString(i);

        Long lw = Long.valueOf(1234);
        Long lw2 = l;
        Long l2 = lw;


    }
    
}
