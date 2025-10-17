package org.example.storage;

public class LocalStorageServiceProvider implements StorageServiceProvider {
    @Override
    public String type(){
        return "local";
    }
    @Override
    public StorageService create(){
        return new LocalStorageService();
    }
}
