package com.cloud.mp.portal.controller;

import com.cloud.infrastructure.common.beans.ResultBean;
import com.cloud.mp.domain.User;
import com.cloud.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String index() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResultBean<User> login(User user, HttpSession session) {
        User loginAccount = userService.login(user);

        if(loginAccount != null){
            session.setAttribute("loginAccount", loginAccount);
        }

        return new ResultBean<User>(loginAccount, "登录成功,3秒后跳转", "index", "帐号不存在或者密码错误");
    }

    @RequestMapping(value = "/out", method = RequestMethod.GET)
    public String out(HttpSession session) {
        session.invalidate();
        return  "login";
    }


}
