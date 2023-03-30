package com.godoro.hws.hw3B;

import com.godoro.hws.hw3A.MyReader;
import com.godoro.hws.hw3A.Product;
import com.godoro.hws.hw3A.ProductConverter;

public class ProductFormat {
    public static void main(String[] args) {

        MyReader reader = new MyReader();
        String path = "/Users/edabicakci/Desktop/private/milsoft/workspace/codes/first/src/com/godoro/hws/hw3A/out.txt";

        ProductConverter converter = new ProductConverter();

        String line = reader.readFile(path);
        Product product = converter.parse(line);

        System.out.printf("Ürün id: %10d Ürün adı: %-20s Ürün fiyatı: %11.2f\n", product.getProductId(),
                product.getProductName(), product.getSalesPrice());

    }

}
