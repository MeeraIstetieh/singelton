package org.example.storage;

public class LocalStorageService implements StorageService {
    @Override
    public void store(String filename, String content) {
        System.out.println("Storing " + filename + " with content \""+content+"\" in local storage");
    }
}
