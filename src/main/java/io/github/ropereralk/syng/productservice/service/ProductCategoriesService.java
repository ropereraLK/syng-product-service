package io.github.ropereralk.syng.productservice.service;

import io.github.ropereralk.syng.productservice.repository.ProductCategoriesRepository;
import org.json.simple.JSONObject;

import java.util.List;

public class ProductCategoriesService {

    ProductCategoriesRepository productCategoriesRepository;
    public List<JSONObject> getProductCategories() throws Exception {


        //Get Data
        List<JSONObject> categoriesList = productCategoriesRepository.getCategoriesList();

        // Do Any Modifications
        return categoriesList;
    }
}
