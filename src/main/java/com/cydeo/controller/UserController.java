package com.cydeo.controller;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    //Avoid use 'new', Always inject, create constructor
    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model) {

        model.addAttribute("user", new UserDTO());//view-user.create-bind fields in view (class min 56)
        // all fields in UserDTO bound in view
        // according to BL we adding attributes here, implementation defined id 'service'
        model.addAttribute("roles", roleService.findAll());
        //how to add users to table
        model.addAttribute("users", userService.findAll());


        return "/user/create";

    }

    @PostMapping("/create")  //  in order to save need use structure below and empty user obj
    public String insertUser(@ModelAttribute("user") UserDTO user, Model model) {
        // we need 1 empty obj to save new user
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.findAll());
        //adding new user to the table
        userService.save(user);// need to pass user obj (empty one )
        model.addAttribute("users", userService.findAll());
        return "/user/create";

        //return "redirect:/user/create"; - we can delete all from above and just use redirect


    }

}
