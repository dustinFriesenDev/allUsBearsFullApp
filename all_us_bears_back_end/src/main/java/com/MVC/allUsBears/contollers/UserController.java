package com.MVC.allUsBears.contollers;

import com.MVC.allUsBears.models.User;
import com.MVC.allUsBears.models.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("add")
    public String processAddUserForm(@RequestBody User user){

        userRepository.save(user);
        return "User Added";
    }

}
