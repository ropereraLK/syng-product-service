package io.github.ropereralk.syng.productservice.service;

import io.github.ropereralk.syng.productservice.repository.ProductRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService  {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<JSONObject> getProductsByCategory(final String categoryId) throws Exception {


        //Get Data
        List<JSONObject> productList = productRepository.getProductsByCategory(categoryId);

        // Do Any Modifications
        return productList;
    }


}
