package com.example.wp.testforview;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangpeng .
 */
public class SingleTon {
    private static Map<String, Object> map = new HashMap<>();

    private SingleTon() {
    }

    public static void registerService(String key, Object intance) {
        if (!map.containsKey(key)) {
            map.put(key, intance);
        }
    }
    public static Object getService(String key){
        return map.get(key);
    }
}
