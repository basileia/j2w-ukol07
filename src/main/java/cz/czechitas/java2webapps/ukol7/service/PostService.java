package cz.czechitas.java2webapps.ukol7.service;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import cz.czechitas.java2webapps.ukol7.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.sql.Date;


@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<Post> list() {
        Pageable findFirst20Posts = PageRequest.of(0, 20);
        Date date = java.sql.Date.valueOf(LocalDate.now());
        return postRepository.findPostByPublishedBeforeOrderByPublishedDesc(date, findFirst20Posts);
    }

    public Post singlePost(String slug) {
        return postRepository.findPostBySlug(slug);
    }
}
