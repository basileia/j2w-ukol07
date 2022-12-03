package cz.czechitas.java2webapps.ukol7.controller;

import cz.czechitas.java2webapps.ukol7.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView listOfPosts() {
        return new ModelAndView("index")
                .addObject("listOfPosts", service.list());
    }

    @GetMapping("detail/{slug}")
    public ModelAndView singlePost(@PathVariable String slug) {
        return new ModelAndView("detail")
                .addObject("post", service.singlePost(slug));
    }


}
