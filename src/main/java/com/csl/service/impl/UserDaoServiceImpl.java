package com.csl.service.impl;

import com.csl.dao.userMapperDao;
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
    userMapperDao userDao;
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
