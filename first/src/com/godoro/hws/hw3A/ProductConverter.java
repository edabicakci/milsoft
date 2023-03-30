package com.godoro.hws.hw3A;


public class ProductConverter {

    public String format(Product product) {
        StringBuilder builder = new StringBuilder();

        Long productId = product.getProductId();
        String name = product.getProductName();
        Double salesPrice = product.getSalesPrice();

        builder.append(productId + "").append(";");
        builder.append(name).append(";");
        builder.append(salesPrice + "");

        return builder.toString();

    }

    public Product parse(String line) {

        Product product = new Product();

        String[] properties = line.split(";");
        product.setProductId(Long.parseLong(properties[0]));
        product.setProductName(properties[1]);
        product.setSalesPrice(Double.parseDouble(properties[2]));

        return product;

    }
}
