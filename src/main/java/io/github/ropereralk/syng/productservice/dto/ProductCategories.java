package io.github.ropereralk.syng.productservice.dto;

public class ProductCategories {

    private String productId;
    private String name;

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public ProductCategories(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public ProductCategories() {
    }
}
