import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

class ConsultaCEP {
    public Endereco buscaEndereco(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
            HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) { //Como ainda essa API é desconhecida, pode ser qualquer exception
            throw new RuntimeException("Houve algum problema em obter o endereço com esse CEP, erro: " + e);
        }


    }
}
