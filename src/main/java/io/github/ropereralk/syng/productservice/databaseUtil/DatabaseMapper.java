package io.github.ropereralk.syng.productservice.databaseUtil;

import io.github.ropereralk.syng.productservice.configurations.MongoConfiguration;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import io.github.ropereralk.syng.productservice.exception.DocumentNotFoundException;

import java.util.List;

public class DatabaseMapper {

    @Autowired
    MongoConfiguration mongoConfiguration;

    public JSONObject find(String key, String value , String collection) throws DocumentNotFoundException {

        Query query = new Query();
        query.addCriteria(Criteria.where(key).is(value));

        try {
            JSONObject document = mongoConfiguration.mongoTemplate().findOne(query, JSONObject.class, collection);

            if (document == null) {
                throw new DocumentNotFoundException(HttpStatus.NOT_FOUND, "DB-FIND_ONE" + " : Document Not Found");
            } else {
                return document;
            }
        }catch (DocumentNotFoundException dne)   {
            throw dne;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public List<JSONObject>findAll(String collection) throws DocumentNotFoundException {

        Query query = new Query();


        try {
            List<JSONObject> documentList =  mongoConfiguration.mongoTemplate().findAll(JSONObject.class,collection);

            if (documentList == null) {
                throw new DocumentNotFoundException(HttpStatus.NOT_FOUND, "DB-FIND_All" + " : Document Not Found");
            } else {
                return documentList;
            }
        }catch (DocumentNotFoundException dne)   {
            throw dne;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }



}
