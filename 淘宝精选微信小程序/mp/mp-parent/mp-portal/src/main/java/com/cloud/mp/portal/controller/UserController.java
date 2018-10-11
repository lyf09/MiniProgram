package com.cloud.mp.portal.controller;


import com.cloud.infrastructure.common.beans.PageResultBean;
import com.cloud.infrastructure.common.beans.PagerInfo;
import com.cloud.mp.domain.User;
import com.cloud.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户列表UI界面
     * @return
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(){
        return "user/index";
    }

    /**
     * 用户列表JSON数据
     * @return
     */
    @RequestMapping("")
    @ResponseBody
    public PageResultBean<User> lists(User user, PagerInfo page){
        return new PageResultBean<User>(userService.lists(null, page));
    }

    /**
     * 添加界面UI
     * @return
     */
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create(){
        return "user/create";
    }




    /*
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ResultBean<List<User>> queryAllUsers() {
        PageParam pageParam = new PageParam();
        PageBean<User> pageBean = userService.queryByPage(pageParam);
        List<User> users = pageBean.getResults();
        return new ResultBean<List<User>>(users);
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String create() {
        return "user/create";
    }

    @RequestMapping(value = "createUser", method = RequestMethod.POST)
    public ResultBean<Integer> create(User user) {
        int result = userService.createUser(user);
        return new ResultBean<Integer>(result, "创建成功", "index", "创建失败");
    }

    @RequestMapping(value = "deleteUser")
    public ResultBean<Integer> deleteUser(List<Integer> userId) {
        int result = userService.deleteUserById(userId);
        return new ResultBean<Integer>(result, "删除成功", "index", "删除失败");
    }

    @RequestMapping(value = "toUpdateUser", method = RequestMethod.GET)
    public ResultBean<User> getUpdateForm(int userId) {
        User user = userService.queryUserById(userId);
        return new ResultBean<User>(user);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultBean<User> update(User user) {
        int result = userService.updateUser(user);
        return new ResultBean<User>(user, "更新成功", "index", "更新失败");
    }
    */

}
