package com.xgen.interview;

import java.util.Arrays;
import java.util.List;

import com.mongodb.client.*;

import org.bson.Document;

/**
 * MongoReceiptStore - MongoDB storage for our receipts
 */
public class MongoReceiptStore implements IReceiptStore {

    @Override
    public void addReceipt(List<Item> receipt) {
        try {
            MongoDbConnector mdb = new MongoDbConnector();
            MongoClient mongoClient = mdb.createConnection();
            MongoDatabase database = mongoClient.getDatabase("mydb");
            MongoCollection<Document> collection = database.getCollection("receipts");
    
    
            Document doc = new Document("items", Arrays.asList(receipt));
            collection.insertOne(doc);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    
}