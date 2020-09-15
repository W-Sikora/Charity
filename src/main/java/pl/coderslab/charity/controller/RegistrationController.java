package pl.coderslab.charity.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.coderslab.charity.model.entities.User;
import pl.coderslab.charity.model.repositories.UserRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public RegistrationController(UserRepository userRepository,
                                  PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String prepareNewUser() {
        return "register";
    }

    @PostMapping
    public String createNewUser(String name,
                                String lastName,
                                String email,
                                String password,
                                RedirectAttributes redirectAttributes) {
        if (userRepository.findByEmail(email).isEmpty()) {
            User user = new User();
            user.setUserName(name);
            user.setLastName(lastName);
            user.setEmail(email);
            user.setPassword(passwordEncoder.encode(password));
            user.setEnabled(true);
            userRepository.save(user);
            return "redirect:/";
        } else {
            redirectAttributes.addAttribute("user already exist", "user already exist!");
            return "redirect:/registration";
        }
    }

}
