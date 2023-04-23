package io.github.ropereralk.syng.productservice.controller;

import io.github.ropereralk.syng.productservice.service.ProductCategoriesService;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class ProductCategoriesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductCategoriesController.class);
    ProductCategoriesService productCategoriesService;
    @GetMapping("/product-categories") List<JSONObject> getProductCategories() throws Exception {


        LOGGER.info("ProductController.getProductCategories() Entering Get ProductList Controller");
        return productCategoriesService.getProductCategories();



    }
}
