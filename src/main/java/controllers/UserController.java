package controllers;

import model.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping("/branch-example")
    public String branchExample(Model model) {
        List<user> userList = new ArrayList<>();
        userList.add(new user(0, "Ken", "American", 1));
        userList.add(new user(1, "James", "English", 2));
        userList.add(new user(2, "Bob", "France", 0));
        userList.add(new user(3, "Andy", "Russia", 1));

        model.addAttribute("users", userList);
        return "branch-example";
    }
}
