package com.epam.collections.inventory_processor;

import java.util.List;

public class Runner {
    public void run(String src){
        InventoryProcessor inventoryProcessor = new InventoryProcessor();
        View view = new View();
        List<Product> originalProductList = inventoryProcessor.originalProductList(inventoryProcessor.readFile(src));
        List<Product> sortedProductList = inventoryProcessor.sort(originalProductList);
        List<Product> distinctProductList = inventoryProcessor.distinct(sortedProductList);
        view.showOriginalList(originalProductList);
        view.showSortedList(sortedProductList);
        view.showDistinctList(distinctProductList);
    }
}
