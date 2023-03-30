package com.godoro.console;

import java.util.Formatter;

public class FormatterTest {
    public static void main(String[] args) {
        long l = 1234;
        String s = "Godoro";
        double d = 3.14159;
        System.out.printf("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n", l, s, d);

        Formatter formatter = new Formatter(System.out);
        formatter.format("Uzun: %10d Sicim: %-20s İkişer: %11.2f\n", l, s, d);
        formatter.close();
    }
    
}
