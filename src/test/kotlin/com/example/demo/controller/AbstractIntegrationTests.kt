package com.example.demo.controller

import org.junit.Before
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class AbstractIntegrationTests {

    @LocalServerPort
    private lateinit var port: Integer

    @Autowired
    private lateinit var builder: RestTemplateBuilder

    protected lateinit var restTemplate: RestTemplate

    @Before
    fun setup() {
        restTemplate = builder.rootUri("http://localhost:$port").build()
    }
}