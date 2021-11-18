package com.epam.collections.inventory_processor;

import java.util.Objects;

/**
 * Class that stores data about product
 */
public class Product implements Comparable<Product> {
    private int code;
    private String title;

    public Product(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code && Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, title);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
