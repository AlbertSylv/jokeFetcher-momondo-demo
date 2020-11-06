package rest;

import DTOs.ChuckDTO;
import DTOs.DadDTO;
import DTOs.OurDTO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import jdk.nashorn.internal.parser.JSONParser;
import utils.HttpUtils;

/**
 * REST Web Service
 *
 * @author lam
 */
@Path("jokes")
public class JokeResource {

    @Context
    private UriInfo context;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJokes() throws IOException {
        Gson gson = new Gson();
        String chuck = HttpUtils.fetchData("https://api.chucknorris.io/jokes/random");
        ChuckDTO chuckDTO = gson.fromJson(chuck, ChuckDTO.class);

        String url = "https://icanhazdadjoke.com";
        String dad = HttpUtils.fetchData(url);
        JsonParser parser = new JsonParser();
        JsonObject json = (JsonObject) parser.parse(dad);
        String value = (String) json.get("joke").toString();
        String joke = value;
        
        DadDTO dadDTO = new DadDTO(joke, url);
        
        
        OurDTO combinedDTO = new OurDTO(chuckDTO, dadDTO);

        String combinedJSON = gson.toJson(combinedDTO);
        return combinedJSON;
    }

}
