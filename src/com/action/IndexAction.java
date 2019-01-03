package com.action;

import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class IndexAction extends ActionSupport {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String test(){
        User user=userService.getUser(1);
        System.out.println(user.getName());
        return SUCCESS;
    }
}
