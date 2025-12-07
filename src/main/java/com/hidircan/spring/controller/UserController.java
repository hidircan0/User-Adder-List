package com.hidircan.spring.controller;

import com.hidircan.spring.model.User;
import com.hidircan.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("users", service.getAllUsers());
        return "users";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        service.addUser(user);
        return "redirect:/users";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        service.deleteById(id);
        return "redirect:/users";
    }

}
