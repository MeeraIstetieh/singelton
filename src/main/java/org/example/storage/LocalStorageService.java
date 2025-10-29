package org.example.storage;

import java.util.Arrays;

public class LocalStorageService implements StorageService {
    @Override
    public void store(String filename, String content) {
        System.out.println("Storing " + filename + " with content \""+content+"\" in local storage");
    }
    @Override
    public void store(StorageRequest request) {
        System.out.println("Local Storing request:");
        System.out.println("  filename   : " + request.getFilename());
        System.out.println("  content    : " + request.getContent());
        System.out.println("  tags       : " + Arrays.toString(request.getTags()));
        System.out.println("  encrypted  : " + request.isEncrypted());
        System.out.println("  compressed : " + request.isCompressed());
        System.out.println("  metadata   : " + request.getMetadata());
        System.out.println("  priority   : " + request.getPriority());
        System.out.println("  retryCount : " + request.getRetryCount());
    }
}
