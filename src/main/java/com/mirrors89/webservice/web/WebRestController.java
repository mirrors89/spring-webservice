package com.mirrors89.webservice.web;

import com.mirrors89.webservice.dto.posts.PostsSaveRequestDto;
import com.mirrors89.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    @Autowired
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello world";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }

}
