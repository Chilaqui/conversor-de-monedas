import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class ConsultaDeMoneda {

    // Consulta de la moneda con su HTTPClient y su Response con el manejo de Excepciones
    public Moneda BusquedaDeMoneda(String monedaBase, String monedaTarget){
    
        URI direction = URI.create("https://v6.exchangerate-api.com/v6/51c7257e5622c508fd1ae873/pair/" + monedaBase + "/" + monedaTarget);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direction).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);//Integracion de la libreria gson

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
