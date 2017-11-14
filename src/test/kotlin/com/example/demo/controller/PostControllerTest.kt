package com.example.demo.controller

import com.example.demo.model.Post
import org.assertj.core.api.Assertions
import org.junit.Test
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod

class PostControllerTest: AbstractIntegrationTests() {

    @Test
    fun list() {
        val posts = restTemplate.exchange("/api/post/", HttpMethod.GET, null, object: ParameterizedTypeReference<List<Post>>() {}).body
        Assertions.assertThat(posts).hasSize(1)
    }
}