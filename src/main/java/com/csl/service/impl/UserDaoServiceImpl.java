package com.csl.service.impl;

import com.csl.dao.UserMapper;
import com.csl.entity.User;
import com.csl.service.UserDaoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @author a
 */
@Service
public class UserDaoServiceImpl implements UserDaoService {
    @Resource
    UserMapper userDao;
    @Override
    public User select() {
        return userDao.select();
    }

    @Override
    public String info(String naem) {
        return userDao.info(naem);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
