package com.example.demo.controller

import com.example.demo.model.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.HttpMethod.GET

class UserControllerTest: AbstractIntegrationTests() {

    @Test
    fun list() {
        val users = restTemplate.exchange("/api/user/", GET, null, object: ParameterizedTypeReference<List<User>>() {}).body
        assertThat(users).hasSize(1)
    }
}