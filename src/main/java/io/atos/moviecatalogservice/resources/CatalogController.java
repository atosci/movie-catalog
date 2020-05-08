package io.atos.moviecatalogservice.resources;

import io.atos.moviecatalogservice.models.CatalogItem;
import io.atos.moviecatalogservice.models.Rating;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
@RequestMapping("/movies")
public class CatalogController {

    @GetMapping("/{title}")
    public String index(@PathVariable("title") String title, Model model){

        RestTemplate restTemplate = new RestTemplate();

        CatalogItem catalogItem = restTemplate.getForObject("http://localhost/catalog/" + title, CatalogItem.class);

        if(catalogItem.getMovie().getTitle() != null) {
            model.addAttribute("movie", catalogItem.getMovie());

            List<Rating> ratings = catalogItem.getRatingList().getRatings();

            model.addAttribute("ratings", ratings);

        }

        return "index";
    }

}
