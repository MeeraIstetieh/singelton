package org.example.storage;

public interface StorageServiceProvider {
    String type();
    StorageService create();

}
