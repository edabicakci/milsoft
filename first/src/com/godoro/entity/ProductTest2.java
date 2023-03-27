package com.godoro.entity;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Product(301, "Cep Telefonu", 3450.0);
        System.out.println("Ürün Özdeşliği: " + product.getProductId());
        System.out.println("Ürün Adı: " + product.getProductName());
        System.out.println("Satış Ederi: " + product.getSalesPrice());
        }
    
}
