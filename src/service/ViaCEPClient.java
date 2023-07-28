package service;

import exception.ViaCEPException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ViaCEPClient {
    private static final String BASE_URL = "https://viacep.com.br/ws/";

    public static String getAddressInfo(String address) throws ViaCEPException, IOException {
        try {
        // Cria a URL para a consulta do CEP
        URL url = new URL(BASE_URL + address + "/json");

        // Abre a conexão HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Verifica se a requisição foi bem sucedida (código 200)
        if (connection.getResponseCode() == 200) {
            // Lê os dados da resposta
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            if (response.toString().contains("\"erro\": true")) {
                throw new ViaCEPException("CEP not found: " + address + ". Try again.");
            }

            reader.close();
            connection.disconnect();

            return response.toString();
        } else {
            // Caso a requisição tenha falhado, lance uma exceção com o código de erro:
            throw new ViaCEPException("Failed to connect. Error code: " + connection.getResponseCode());
        }
    } catch (IOException e) {
            throw new ViaCEPException("Error while accessing ViaCEP API: " + e.getMessage(), e);
        }
    }
}
