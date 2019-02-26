package com.csl.dao;

import com.csl.entity.User;

public interface UserMapper {
    User select();
    String info(String name);
    User login(User user);
}
