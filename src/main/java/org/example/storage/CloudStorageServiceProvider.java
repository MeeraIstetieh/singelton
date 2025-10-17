package org.example.storage;

public class CloudStorageServiceProvider implements StorageServiceProvider {
    @Override
    public String type(){
        return "cloud";
    }
    @Override
    public StorageService create(){
        return new CloudStorageService();
    }
}
