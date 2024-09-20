package com.wooeky.lecture.comment.repository;

import com.wooeky.lecture.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
