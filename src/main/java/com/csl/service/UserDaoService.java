package com.csl.service;

import com.csl.entity.User;

/**
 * @author a
 */
public interface UserDaoService {
    User select();
    String info(String naem);
}
