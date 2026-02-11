package br.com.alura.screenmatch.service;

import dev.langchain4j.model.googleai.GoogleAiGeminiChatModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsultaGemini {

    private static final Logger logger = LoggerFactory.getLogger(ConsultaGemini.class);

    public static String obterTraducao(String texto) {
        // Se o texto estiver vazio ou nulo, nem chama a API
        if (texto == null || texto.isEmpty()) {
            return "";
        }

        System.out.println(texto);

        GoogleAiGeminiChatModel model = GoogleAiGeminiChatModel.builder()
                .apiKey(System.getenv("CHAVE_GEMINI"))
                .modelName("gemma-3-27b-it")
                .build();

        try {
            logger.info("Solicitando tradução ao Gemini...");
            // O prompt continua o mesmo
            String texto_traduzido = model.generate("Traduza para o português do Brasil: " + texto);
            System.out.println(texto_traduzido);
            return texto_traduzido;

        } catch (Exception e) {
            logger.error("Erro ao consultar a API do Gemini: {}", e.getMessage());
            // Em caso de erro, retornamos o texto original para não travar a aplicação
            return texto;
        }
    }
}