package com.tutorial.movies.rest.springboot.movies.test;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = MovieControllerTest.class)
@ActiveProfiles("test")
public class MovieControllerTest {

    @Autowired
    private MockMvc mx;

    @BeforeEach
    void setUp() {
    }
}
