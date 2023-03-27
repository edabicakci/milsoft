package com.godoro.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> provinceList = new ArrayList<>();
        provinceList.add("İstanbul");
        provinceList.add("Ankara");
        provinceList.add("İzmir");
        provinceList.add("Bursa");
        provinceList.add("Adana");

        for (String province : provinceList) {
            System.out.println(province);
            
        }
        
    }
}
