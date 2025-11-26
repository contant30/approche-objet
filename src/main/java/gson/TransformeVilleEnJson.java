package gson;

import com.google.gson.Gson;
import tp.listes.Ville;

public class TransformeVilleEnJson {
    static void main(String[] args) {

        Gson gson = new Gson();

        // Objet simple
        Ville p = new Ville( "Marseille",8345211);

        // Conversion en JSON
        String json = gson.toJson (p);

        System.out.println(json);


    }


}
