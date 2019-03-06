package com.mirrors89.webservice.web;

import com.mirrors89.webservice.domain.posts.PostsRepository;
import com.mirrors89.webservice.dto.posts.PostsSaveRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

    @Autowired
    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

}
