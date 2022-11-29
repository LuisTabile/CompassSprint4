package com.compass.sprint4.political;

import com.compass.sprint4.political.controller.AssociadosController;
import com.compass.sprint4.political.controller.PartidosController;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private AssociadosController associadosController;
    @Autowired
    private PartidosController partidosController;
    private String API = "http://localhost:8080/associados";

    @Test
        //GET ASSOCIADOS
    void case1() throws Exception {

    }

}
