package application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.ViaCEPException;
import models.Address;
import service.ViaCEPClient;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ViaCEP Client. Please enter your CEP.");
        String address = scanner.nextLine();

        try {
            String response = ViaCEPClient.getAddressInfo(address);

            // Criar o objeto Gson:
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

            // Converter a resposta JSON em um objeto Java (neste caso, um JsonObject):
            Address addressObject = gson.fromJson(response, Address.class);

            // Imprimir o objeto Address com o formato personalizado:
            System.out.println(addressObject);

            // Gravar o objeto Java em um arquivo JSON.
            FileWriter writer = new FileWriter("address.json");
            gson.toJson(addressObject, writer);
            writer.close();
        } catch (IOException | ViaCEPException e) {
            System.out.println("There was an error while getting the address: " + e.getMessage());
        }

        System.out.println("Thank you for consulting your address information with ViaCep client!");
    }
}