package com.example.demo.Utill;

public class ProductOrder {
    private String productName;
    private int productOrderCount;

    public ProductOrder(String productName, int productOrderCount) {
        this.productName = productName;
        this.productOrderCount = productOrderCount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductOrderCount() {
        return productOrderCount;
    }

    public void setProductOrderCount(int productOrderCount) {
        this.productOrderCount = productOrderCount;
    }
}
