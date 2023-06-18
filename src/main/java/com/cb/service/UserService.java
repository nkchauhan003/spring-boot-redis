package com.cb.service;

import com.cb.model.User;

public interface UserService {
    void saveUser(User user);

    User getUser(String id);
}
