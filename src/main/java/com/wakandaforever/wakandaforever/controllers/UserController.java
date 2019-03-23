package com.wakandaforever.wakandaforever.controllers;

import com.wakandaforever.wakandaforever.dtos.UserDto;
import com.wakandaforever.wakandaforever.models.User;
import com.wakandaforever.wakandaforever.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping(value="/users")
    public ResponseEntity<List<User>> listUser(){
        return new ResponseEntity<>(userService.findAll(),HttpStatus.OK);
    }

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> getOne(@PathVariable(value = "id") Long id){
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }


    @PostMapping(value="/signup")
    public ResponseEntity<User> saveUser(@RequestBody UserDto user){
    	if(userService.findOne(user.getUsername()) != null) {
    		return new ResponseEntity<>(null,HttpStatus.CONFLICT);
    	}
        return new ResponseEntity<>(userService.save(user),HttpStatus.OK);
    }



}
