package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//실제 DB 테이블과 매칭될 클래스
@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id // PK field
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate rule - auto increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private  String content;

    private String author;

    // builder 클래스- 어느 필드에 어떤값을 채워야할지 명확히 인지
    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    // Dirty Checking : 트렌젝션이 끝나는 시점에 테이블의 변경분을 반영-> Update 쿼리문 날릴필요없음
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
