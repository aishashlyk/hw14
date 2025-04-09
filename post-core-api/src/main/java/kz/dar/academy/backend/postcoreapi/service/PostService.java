package kz.dar.academy.backend.postcoreapi.service;

import kz.dar.academy.backend.postcoreapi.model.PostModel;
import java.util.List;

public interface PostService {
    void createPost(PostModel post);
    List<PostModel> getAllPosts();
    PostModel getPostById(String postId);
    void updatePostById(String postId, PostModel updatedPost);
    void deletePostById(String postId);
}
