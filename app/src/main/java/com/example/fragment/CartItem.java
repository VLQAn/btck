package com.example.fragment;

public class CartItem {
    private String productName;
    private String productDescription;
    private int productImage;

    public CartItem(String productName, String productDescription, int productImage) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductImage() {
        return productImage;
    }
}

