package br.com.alura.screenmatch.service;

public class ErroConsultaApiException extends RuntimeException {
    public ErroConsultaApiException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
