package com.myblog.myblog11.controller;
import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    public PostController(PostService postService) {
        this.postService = postService;
    }
    private PostService postService;
     @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
      PostDto dto =postService.createPost(postDto);
      return new ResponseEntity<>(dto, HttpStatus.CREATED);

    }

    //http://localhost:8081/api/posts?id=1
       @GetMapping
      public ResponseEntity<PostDto> getPostById(@RequestParam long id){
           PostDto dto = postService.getPostById(id);
           return new ResponseEntity<>(dto,HttpStatus.OK);


       }

}
