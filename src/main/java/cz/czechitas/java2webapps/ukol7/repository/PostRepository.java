package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Post findPostBySlug(String slug);

    Pageable findFirst20Posts = PageRequest.of(0, 20);
    Page<Post> findPostByPublishedBeforeOrderByPublishedDesc(Date date, Pageable findFirst20Posts);
}
