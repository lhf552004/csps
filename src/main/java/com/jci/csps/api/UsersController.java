package com.jci.csps.api;

import com.jci.csps.models.User;
import com.jci.csps.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/users")
@RestController
public class UsersController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void createUser(@RequestBody User user){
        user.setId(UUID.randomUUID());
        userRepository.insert(user);
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "{id}")
    public Optional<User> getUser(@PathVariable UUID id){
        return userRepository.findById(id);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable UUID id, @RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable UUID id){
        userRepository.deleteById(id);
    }
}
