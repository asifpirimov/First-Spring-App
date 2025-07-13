package com.example.firstappd3.FirstApp_D3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> userList = new ArrayList<>();

    @PostMapping("/create")
    public String createUser(@RequestBody User user) {
        userList.add(user);
        return "Created user: " + user.getName() + ", Age: " + user.getAge();
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userList;
    }



    @GetMapping("/test")
    public String test() {
        return "User endpoint working";
    }
}
