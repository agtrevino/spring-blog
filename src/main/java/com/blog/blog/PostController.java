package com.blog.blog;

import com.blog.blog.Post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    private String index(Model model){

        ArrayList<String> posts = new ArrayList<>();

        posts.add("ayoo");
        posts.add("ayoo 2");
        posts.add("yayuuuh");

        model.addAttribute("listOfPosts", posts);

        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    private String show(@PathVariable long id, Model model){
        Post post = new Post("PS4", "It's for sale.");

        model.addAttribute("post", post);
        model.addAttribute("post-id", id);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    private String createPost(){
        return "view create posts page";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    private String postCreatePost(){
        return "Create posts";
    }
}
