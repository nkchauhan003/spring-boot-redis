package com.cb.service;

public interface RedisService {
    void setValue(String key, String value);

    Object getValue(String key);
}
