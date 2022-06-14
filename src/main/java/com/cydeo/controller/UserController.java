package com.cydeo.controller;

import com.cydeo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());//view-user.create-bind fields in view (class min 56)
        // all fields in UserDTO bound in view



        return "/user/create";

    }

}
