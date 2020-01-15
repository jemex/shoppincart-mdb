package com.xgen.interview;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
/**
 * MongoDbConnector
 */
public class MongoDbConnector {

    public MongoClient createConnection() {
        try {
            //Dummy
            MongoClient mongoClient = MongoClients.create("localhost");
            return mongoClient;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }    
}