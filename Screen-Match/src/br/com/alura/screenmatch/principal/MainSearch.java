package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme: ");
        var busca = scanner.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=a1c06498";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(endereco))
             .build();

        HttpResponse<String> response = client
         .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
