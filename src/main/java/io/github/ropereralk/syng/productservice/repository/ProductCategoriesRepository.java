package io.github.ropereralk.syng.productservice.repository;

import io.github.ropereralk.syng.productservice.databaseUtil.DatabaseMapper;
import org.json.simple.JSONObject;

import java.util.List;

public class ProductCategoriesRepository {
    DatabaseMapper databaseMapper;
    public List<JSONObject> getCategoriesList() throws Exception {
        return databaseMapper.findAll("Categories");
    }
}
