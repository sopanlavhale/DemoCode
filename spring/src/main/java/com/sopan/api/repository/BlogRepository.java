package com.sopan.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopan.api.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>{

}
