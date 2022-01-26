package com.johannpando.feigndemo.clients;

import com.johannpando.feigndemo.dto.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "posts", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {

    @GetMapping(value = "/posts")
    List<Post> getAll();
}
