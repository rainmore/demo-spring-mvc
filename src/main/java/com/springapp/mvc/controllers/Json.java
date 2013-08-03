package com.springapp.mvc.controllers;

import com.springapp.mvc.models.Author;
import com.springapp.mvc.models.Post;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

@Controller
public class Json {

    @RequestMapping(value="/json", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Set<Post> posts() {
        Author author1 = new Author();
        author1.setId(new Long(12));
        author1.setFirstName("Felix");
        author1.setLastName("Rong");

        DateTime d1 = new DateTime(2013, 7, 18, 12, 00, 00);
        DateTime d2 = new DateTime(2013, 8, 18, 12, 00, 00);

        Post post1 = new Post();
        post1.setId(new Long(1));
        post1.setAuthor(author1);
        post1.setContent("Test as fasd fas fsa fsaf ");
        post1.setTitle("Post 1");
        post1.setPublicDate(d1);


        Post post2 = new Post();
        post2.setId(new Long(2));
        post2.setAuthor(author1);
        post2.setContent("Test as fasd fas fsa fsaf a daf asdf sda f");
        post2.setTitle("Post 2");
        post2.setPublicDate(d2);


        Set<Post> posts = new HashSet<>();
        posts.add(post1);
        posts.add(post2);

        return posts;
    }
}
