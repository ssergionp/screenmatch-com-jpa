package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {

    public String obterDados(String endereco) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        } catch (IOException e) {
            throw new ErroConsultaApiException("Falha na comunicação com a API.", e);
        } catch (InterruptedException e) {
            // SOLUÇÃO: Avisa a Thread atual que ela foi interrompida
            Thread.currentThread().interrupt();
            // Agora sim, lança a exceção
            throw new ErroConsultaApiException("A operação foi interrompida inesperadamente.", e);
        }
    }
}
