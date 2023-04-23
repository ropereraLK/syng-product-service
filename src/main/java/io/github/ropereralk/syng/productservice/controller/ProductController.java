package io.github.ropereralk.syng.productservice.controller;

import io.github.ropereralk.syng.productservice.dto.ProductCategories;
import io.github.ropereralk.syng.productservice.service.ProductService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @GetMapping
    public void getProductsByCategory(){

    }

    @GetMapping("/categories")
    List<JSONObject>  getProductCategories() throws Exception {

        LOGGER.info("ProductController.getProductCategories() Entering Get ProductList Controller");
        return productService.getProductCategories();



    }
}
