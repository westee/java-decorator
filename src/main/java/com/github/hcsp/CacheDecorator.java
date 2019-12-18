package com.github.hcsp;

import java.util.HashMap;
import java.util.Map;

public class CacheDecorator implements DataService{
    private Map<String, String> cache = new HashMap<>();

    private DataService delegate;

    public CacheDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    @Override
    public String a(int i) {
        String cacheValue = cache.get("a");
        if(cacheValue == null){
            String realValue = delegate.a(i);
            cache.put("a", realValue);
            return realValue;
        } else {
            return cacheValue;
        }
    }

    @Override
    public String b(int i) {
        String cacheValue = cache.get("b");
        if(cacheValue == null){
            String realValue = delegate.a(i);
            cache.put("b", realValue);
            return realValue;
        } else {
            return cacheValue;
        }
    }
}
