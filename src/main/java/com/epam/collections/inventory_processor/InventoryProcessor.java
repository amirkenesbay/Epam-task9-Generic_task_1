package com.epam.collections.inventory_processor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

/**
 * Class for working with inventory
 */
public class InventoryProcessor {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.run(args[0]);
    }

    public List<Product> sort(List<Product> products) {
        return new ArrayList<>(new TreeSet<>(products));
    }

    public List<Product> distinct(List<Product> products) {
        Set<Product> productSet = new HashSet<>(products);
        return new ArrayList<>(productSet);
    }

    public String readFile(String src) {
        String productsFile = null;
        try {
            File file = new File(src);
            productsFile = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productsFile;
    }

    public List<Product> originalProductList(String productsList) {
        String[] productString = productsList.split("\r\n");
        List<Product> products = new ArrayList<>();
        for (String value : productString) {
            String[] productArr = value.split("=");
            products.add(new Product(Integer.parseInt(productArr[0]), productArr[1]));
        }
        return products;
    }
}
