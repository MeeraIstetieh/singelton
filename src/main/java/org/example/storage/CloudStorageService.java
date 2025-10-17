package org.example.storage;

public class CloudStorageService implements StorageService {
    @Override
    public void store(String fileName, String content){
        System.out.println("Storing " + fileName + " with content \""+content+"\" in Cloud Storage");
    }

}
