package com.johannpando.feigndemo;



import com.johannpando.feigndemo.clients.PostClient;
import com.johannpando.feigndemo.dto.Post;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FeignDemoApplicationTests {

    @Autowired
	private PostClient postClient;

    @Test
    public void shouldLoadAllPost() {
        final List<Post> posts = postClient.getAll();
        Assertions.assertNotNull(posts);
        Assertions.assertFalse(posts.isEmpty());
    }
}
