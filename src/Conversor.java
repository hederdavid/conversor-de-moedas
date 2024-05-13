import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    public Moeda converterValores(String moedaAConverter, String moedaASerConvertida) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/42a6cb567ba63c72b59a98a3/pair/" +
                        moedaAConverter + "/" + moedaASerConvertida))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), Moeda.class);

        } catch (Exception e) {
            System.out.println("Algo deu errado ao tentar consultar a API... Tente novamente.");
        }
        return null;
    }
}
