package com.godoro.hws.hw3B;

import java.util.Scanner;

import com.godoro.entity.Product;

public class ProductScan {
    public static void main(String[] args) {

        Product product = new Product();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün id giriniz.");
        Long productId = scanner.nextLong();

        System.out.println("Ürün adı giriniz.");
        String name = scanner.nextLine();

        System.out.println("Ürün fiyatı giriniz.");
        Double salesPrice = scanner.nextDouble();

        product.setProductId(productId);
        product.setProductName(name);
        product.setSalesPrice(salesPrice);

    }

}
