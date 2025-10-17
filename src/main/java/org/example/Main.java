package org.example;

import org.example.storage.StorageService;
import org.example.storage.StorageServiceFactory;

public class Main {
    public static void main(String[] args) {
        StorageService storage= StorageServiceFactory.getStorageService();
        storage.store("file.txt","Hello World");
    }
}