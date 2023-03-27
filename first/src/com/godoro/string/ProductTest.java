package com.godoro.string;

public class ProductTest {

    public static void main(String[] args) {
        Product product = new Product();
        ProductConverter converter = new ProductConverter();
        String line = converter.format(product);
        System.out.println("Satır: " + line);
        Product product2 = converter.parse(line);
        System.out.println("Ürün: " + product2);
    }
    
}
