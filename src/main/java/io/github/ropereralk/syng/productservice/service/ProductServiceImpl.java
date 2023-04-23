package io.github.ropereralk.syng.productservice.service;

import io.github.ropereralk.syng.productservice.repository.ProductCategoriesRepository;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService  {
    @Autowired ProductCategoriesRepository productCategoriesRepository;

    @Override
    public List<JSONObject> getProductsByCategory(String productId) throws Exception {


        //Get Data
        List<JSONObject> categoriesList = productCategoriesRepository.getCategoriesList();

        // Do Any Modifications
        return categoriesList;
    }


}
