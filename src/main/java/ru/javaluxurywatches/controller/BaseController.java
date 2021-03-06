package ru.javaluxurywatches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.javaluxurywatches.repository.blog.PostRepository;
import ru.javaluxurywatches.repository.shop.ItemRepository;

@Controller
public class BaseController {

    private interface Attr {
        String WELCOME_MESSAGE = "welcome";
        String POSTS = "posts";
        String INDEX_ITEMS = "indexItems";
    }

    private final PostRepository postRepository;
    private final ItemRepository itemRepository;

    @Autowired
    public BaseController(PostRepository postRepository, ItemRepository itemRepository) {
        this.postRepository = postRepository;
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute(Attr.WELCOME_MESSAGE, "Welcome in Java Luxury Watches Shop!");
        model.addAttribute(Attr.INDEX_ITEMS, itemRepository.findAll());
        model.addAttribute(Attr.POSTS, postRepository.findByIsSlider(true));
        return "index";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    boolean testMethod() {
        return true;
    }

}
