package io.github.ropereralk.syng.productservice.service;

import io.github.ropereralk.syng.productservice.dto.ProductCategories;
import org.json.simple.JSONObject;

import java.util.List;

public interface ProductService {
    List<JSONObject> getProductsByCategory(String productId) throws Exception;


}
