package org.example.storage;

import java.util.Arrays;

public class CloudStorageService implements StorageService {
    @Override
    public void store(String fileName, String content){
        System.out.println("Storing " + fileName + " with content \""+content+"\" in Cloud Storage");
    }
    @Override
    public void store(StorageRequest request) {
        System.out.println("Cloud Storing request:");
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
