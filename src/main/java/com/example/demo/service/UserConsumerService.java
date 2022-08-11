package com.example.demo.service;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserConsumerService {

    private RestTemplate restTemplate;
    private final String USER_URL = "https://jsonplaceholder.typicode.com/users";
    private final String POSTS_BY_USER_URL = "https://jsonplaceholder.typicode.com/users/{idUser}/posts";

    public UserConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User[] getUsers() {
        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(USER_URL, User[].class);
        return responseEntity.getBody();
    }

    public Post[] getPostsByUser(int userId) {
        ResponseEntity<Post[]> responseEntity = restTemplate.getForEntity(POSTS_BY_USER_URL, Post[].class, userId);
        return responseEntity.getBody();
    }
}
