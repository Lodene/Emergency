package real.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Api {

    public void effectuerAppelAPI() {
        // Logique métier
        // ...

        // Appel API
        try {
            URL url = new URL("https://api.example.com/endpoint");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configurer la connexion, envoyer des données, recevoir la réponse, etc.

            // Traiter la réponse de l'API
            // ...
        } catch (IOException e) {
            e.printStackTrace();
            // Gérer les erreurs d'API
        }
    }
}