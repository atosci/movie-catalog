package io.atos.moviecatalogservice.resources;

import com.google.gson.Gson;
import io.atos.moviecatalogservice.models.CatalogItem;
import io.atos.moviecatalogservice.models.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/movies")
public class CatalogController {

    @GetMapping("/{title}")
    public String index(Model model, @PathVariable("title") String title){

        RestTemplate restTemplate = new RestTemplate();

        CatalogItem response = restTemplate.getForObject("http://localhost/catalog/" + title, CatalogItem.class);

        Gson gson = new Gson();

        model.addAttribute("movie", response);

        return gson.toJson(response);
    }

}
