package io.github.ropereralk.syng.productservice.repository;

import io.github.ropereralk.syng.productservice.databaseUtil.DatabaseMapper;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductRepository {

    @Autowired
    DatabaseMapper databaseMapper;
    public List<JSONObject> getProductsByCategory(final String categoryId) throws Exception {

        return databaseMapper.findAllByKey("categoryId",categoryId, "products");

    }
}
