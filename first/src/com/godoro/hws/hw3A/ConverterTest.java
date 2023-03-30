package com.godoro.hws.hw3A;

public class ConverterTest {
    public static void main(String[] args) {

        String path = "src/com/godoro/hws/hw3A/out.txt";

        Product product = new Product(301, "Cep Telefonu", 2345.0);
        Product product1 = new Product(302, "Cep krf", 234.0);
        ProductConverter converter = new ProductConverter();
        String formattedProduct = converter.format(product);
        String formattedProduct1 = converter.format(product1);

        try {
            MyWriter writer = new MyWriter(path);
            writer.writeFile(formattedProduct);
            writer.writeFile(formattedProduct1);
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        
     

        // Product parsedProduct = converter.parse(formattedProduct);
        // System.out.println("formattedProduct: " + formattedProduct);
        // System.out.println("parsedProduct: " + parsedProduct.getProductId() + " " +
        // parsedProduct.getProductName()
        // +" " + parsedProduct.getSalesPrice());

        MyReader reader = new MyReader();
        String line = reader.readFile(path);

        System.out.println("Line: " + line);

    }

}
