package com.example.finanzasbackend.app.api;

import com.example.finanzasbackend.app.domain.model.entity.User;
import com.example.finanzasbackend.app.domain.service.UserService;
import com.example.finanzasbackend.app.mapping.UserMapper;
import com.example.finanzasbackend.app.resources.user.CreateUserResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private final UserService userService;
    private final UserMapper mapper;

    public UserController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper = mapper;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/authenticate/{username}/{password}")
    public User authenticate(@PathVariable String username, @PathVariable String password){
        return userService.authenticate(username, password);
    }

    @PostMapping("/create")
    public User create(@RequestBody CreateUserResource user){
        return userService.create(mapper.toModel(user));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return userService.delete(id);
    }
}
