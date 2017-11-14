package com.example.demo.model

import java.time.LocalDateTime

data class Post (
        val slug: String,
        val title: String,
        val headline: String,
        val content: String,
        val author: User,
        val addedAt: LocalDateTime = LocalDateTime.now()
)

/*
data class Post (
        @Id val slug: String,
        val title: String,
        val headline: String,
        val content: String,
        @DBRef val author: User,
        val addedAt: LocalDateTime = LocalDateTime.now()
)*/
