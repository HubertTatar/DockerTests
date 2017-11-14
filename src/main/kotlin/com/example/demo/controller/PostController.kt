package com.example.demo.controller

import com.example.demo.model.Post
import com.example.demo.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PostController() {

    @GetMapping("/api/post/")
    fun findAll(): List<Post> {
        val u1 = User("bob", "Bob", "Doe", "Uncle Bob")
        val p1 = Post("medicine-man", "medicine man", "medicine man", "medicine man", u1)
        return listOf<Post>(p1)
    }// = postRepository.findAll()
}