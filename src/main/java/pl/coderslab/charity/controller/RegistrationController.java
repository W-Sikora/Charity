package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.entities.User;
import pl.coderslab.charity.model.repositories.UserRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    private UserRepository userRepository;

    @GetMapping
    public String prepareNewUser(Model model) {
        model.addAttribute(new User());
        return "register";
    }

    @PostMapping
    public String createNewUser(User user) {
        return "/";
    }

}