package com.epam.collections.inventory_processor;

import java.util.List;

public class View {
    public void showOriginalList(List<Product> list){
        System.out.println("Original list: ");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showSortedList(List<Product> list){
        System.out.println("Sorted list: ");
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showDistinctList(List<Product> list){
        System.out.println("Distinct list: ");
        for (Product product : list) {
            System.out.println(product);
        }
    }
    
}
