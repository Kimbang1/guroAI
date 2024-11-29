package com.drill.domain.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.drill.domain.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
