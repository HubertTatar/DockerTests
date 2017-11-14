package com.example.demo.controller

import com.example.demo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController() {

    @GetMapping("/api/user/")
    fun findAll(): List<User> {
        val u1 = User("bob", "Bob", "Doe", "Uncle Bob")
        return listOf<User>(u1)
    }// = userRepository.findAll()
}