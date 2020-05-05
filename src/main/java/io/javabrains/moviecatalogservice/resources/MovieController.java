package io.javabrains.moviecatalogservice.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MovieController {

    @GetMapping("/index")
    public String index(Model model){


        model.addAttribute("movie", "Catch me if you can");

        return "index";
    }

}
