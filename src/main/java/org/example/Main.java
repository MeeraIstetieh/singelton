package org.example;

import org.example.storage.StorageRequest;
import org.example.storage.StorageService;
import org.example.storage.StorageServiceFactory;

public class Main {
    public static void main(String[] args) {
        StorageService storage= StorageServiceFactory.getStorageService();
        storage.store("file.txt","Hello World");

        StorageRequest req = StorageRequest.builder()
                .filename("file.txt")
                .content("data")
                .isEncrypted(true)
                .tags(new String[] {"important"})
                .priority(8)
                .build();
        System.out.println(req);
    }

}