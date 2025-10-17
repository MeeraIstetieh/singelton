package org.example.storage;

import org.example.ConfigLoader;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

public final class StorageServiceFactory {
    private static final Map<String,StorageServiceProvider> PROVIDERS= new HashMap<>();
    static{
        ServiceLoader<StorageServiceProvider> loader= ServiceLoader.load(StorageServiceProvider.class);
        for(StorageServiceProvider provider: loader){
            PROVIDERS.put(provider.type(), provider);
        }

    }
    private StorageServiceFactory(){}


    public static StorageService getStorageService() {
        JSONObject s= ConfigLoader.getInstance().getSettings();
        String type=s.optString("storageType");
        StorageServiceProvider provider=PROVIDERS.get(type);
        if(provider == null){
            throw new IllegalArgumentException("Unknown storage type");
        }
        return provider.create();
    }
}
