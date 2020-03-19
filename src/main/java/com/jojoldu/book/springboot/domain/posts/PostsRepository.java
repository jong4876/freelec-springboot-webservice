package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// posts 클래스로 DB를 접근하게 해줄 인터페이스
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
