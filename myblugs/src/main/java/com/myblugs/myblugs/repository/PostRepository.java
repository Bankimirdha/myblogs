package com.myblugs.myblugs.repository;

import com.myblugs.myblugs.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
