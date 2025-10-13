package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONObject;
public class ConfigLoader {
private static volatile ConfigLoader instance;
    private static final String PATH = "config.json";
    private final JSONObject settings;

    private ConfigLoader() {
        try {
            String content = Files.readString(Path.of(PATH));
            settings = new JSONObject(content);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
public static ConfigLoader getInstance() {
    ConfigLoader result = instance;
    if (result == null) {
        synchronized (ConfigLoader.class) {
            result = instance;
            if (result == null) {
                result = instance = new ConfigLoader();
            }
        }
    }
    return result;

}
    public JSONObject getSettings() {
        return settings;
    }

    private void write(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(PATH))) {
            writer.write(settings.toString());
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
    public synchronized void set(String key, Object value) {
        settings.put(key, value);
        write();
    }
}
