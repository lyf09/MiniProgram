package com.cloud.mp.service;


import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.User;
import com.cloud.mp.domain.UserExample;
import com.github.pagehelper.PageInfo;

public interface UserService{

    public PageInfo<User> lists(UserExample example, PagerInfo page);

    User getByPk(Integer id);

    User login(User user);

}
