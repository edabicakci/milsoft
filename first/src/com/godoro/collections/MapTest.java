package com.godoro.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("tr", "Türkiye");
        countries.put("az", "Azerbaycan");
        countries.put("tm", "Türkmenistan");
        countries.put("uz", "Özbekistan");
        countries.put("kz", "Kazakistan");
        countries.put("kg", "Kırgızistan");

        for (String code : countries.keySet()) {
            System.out.println("#" + code + " " + countries.get(code));
            
        }  
        
        for (Entry<String, String> entry : countries.entrySet()) {
            System.out.println("*" + entry.getKey() + ":" + entry.getValue());   
            
        }
    }
    
}
