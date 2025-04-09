package kz.dar.academy.backend.postcoreapi.controller;

import jakarta.validation.Valid;
import kz.dar.academy.backend.postcoreapi.model.PostModel;
import kz.dar.academy.backend.postcoreapi.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    Environment env;

    @Autowired
    private PostService postService;

    @GetMapping("/post/check")
    public String checkService() {

        return "post-core-api is working at "+ env.getProperty("local.server.port");
    }

    @PostMapping("/post")
    public ResponseEntity<String> createPost(@RequestBody PostModel postModel) {
        postService.createPost(postModel);
        return ResponseEntity.ok("Successfully created.");
    }

    @GetMapping("/all")
    public List<PostModel> getAllPosts() { return postService.getAllPosts(); }

    @GetMapping("/{postId}")
    public PostModel getPostById(@PathVariable String postId) {
        return postService.getPostById(postId);
    }

    @PutMapping("/{postId}")
    public ResponseEntity<String> updatePostById(@PathVariable String postId, @Valid @RequestBody PostModel postModel) {
        postService.updatePostById(postId, postModel);
        return ResponseEntity.ok("Post updated successfully.");
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<String> deletePostById(@PathVariable String postId) {
        postService.deletePostById(postId);
        return ResponseEntity.ok("Post deleted successfully.");
    }
}



