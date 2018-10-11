package com.cloud.mp.service.impl;

import com.cloud.infrastructure.common.beans.PagerInfo;

import com.cloud.infrastructure.common.utils.encryption.Md5Utils;
import com.cloud.mp.domain.User;
import com.cloud.mp.domain.UserExample;
import com.cloud.mp.mapper.UserMapper;
import com.cloud.mp.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo<User> lists(UserExample example, PagerInfo page) {
        PageHelper.startPage(page.getPageIndex(), page.getPageSize());
        return new PageInfo<>(userMapper.selectByExample(example));
    }

    @Override
    public User getByPk(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User login(User user) {
        user.setLoginPassword(Md5Utils.md5(user.getLoginPassword()));

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginAccountEqualTo(user.getLoginAccount());
        criteria.andLoginPasswordEqualTo(user.getLoginPassword());
        List<User> users = userMapper.selectByExample(example);
        return  users.size() > 0 ? users.get(0): null;
    }
}
