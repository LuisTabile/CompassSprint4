package com.compass.sprint4.political.controller;

import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.*;

class AssociadosControllerTest {

    @Test
    void cadastroAssociados() {
    }

    @Test
    void listar() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/associados")).build();
        CompletableFuture cf = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println);
        System.out.println("passed");
        HttpResponse<String> result = (HttpResponse<String>) cf.join();
    }

    @Test
    void detalhes() {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://localhost:8080/partidos/5")).build();
        CompletableFuture cf = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body).thenAccept(System.out::println);
        System.out.println("passed");
        HttpResponse<String> result = (HttpResponse<String>) cf.join();
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}