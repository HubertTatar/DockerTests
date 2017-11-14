package com.example.demo.model

data class User (
        val login: String,
        val firstName: String,
        val lastName: String,
        val description: String
)

/*
data class User (
        @Id val login: String,
        val firstName: String,
        val lastName: String,
        val description: String
)*/
