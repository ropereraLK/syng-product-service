package io.github.ropereralk.syng.productservice.controller;

import io.github.ropereralk.syng.productservice.exception.SanitizerException;
import io.github.ropereralk.syng.productservice.service.ProductService;
import io.github.ropereralk.syng.productservice.util.Sanitizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    ProductService productService;

    @GetMapping("category/{categoryId}/products")
    public void getProductsByCategory(@PathVariable String categoryId ) throws Exception, SanitizerException {

        productService.getProductsByCategory(Sanitizer.sanitize(categoryId));


    }


}
