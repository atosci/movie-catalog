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

/**
 * @author Mohamed El Kawakibi
 */
@Controller
@RequestMapping("/movies")
public class CatalogController {

    /** Gets information about a movie and its ratings
     * If a movie can be found with the given @title, a page will display the information
     * Else, the page will display that no information could be found with the given @title
     *
     * @param title A String representing the movie title
     * @param model A model representing the thymeleaf template that is used to bind and display data on the .html file
     * @return A String representing the index.html file
     */
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
