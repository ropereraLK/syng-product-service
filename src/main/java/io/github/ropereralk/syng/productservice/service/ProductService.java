package io.github.ropereralk.syng.productservice.service;

import io.github.ropereralk.syng.productservice.dto.ProductCategories;

import java.util.List;

public interface ProductService {
    List<ProductCategories> getProducCategories();
}
