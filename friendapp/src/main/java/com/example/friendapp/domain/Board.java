package com.example.friendapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

//    @Table("board") // 데이터베이스 테이블과 매핑됩니다. (테이블명과 클래스명이 같으면 생략가능)
    @Setter
    @Getter
    public class Board {
        @Id // Primary key임을 나타냅니다.
        private Long id;

        private String name;
        private String title;
        private String password; // 실제 구현에서는 해싱된 값이 저장됩니다.
        private String content;
//        @Column("created_at")  //필드명과 컬럼명의 규칙을 따르면 생략가능  규칙: 컬럼의'_' 대신 필드는 '_' 다음 나오는 문자를 대문자로 써줌. ex)dept_name  :  deptName
        private LocalDateTime createdAt = LocalDateTime.now(); // 생성 시 자동으로 시간을 설정합니다.
//        @Column("updated_at")
        private LocalDateTime updatedAt = LocalDateTime.now(); // 생성 시 자동으로 시간을 설정하고, 업데이트 시 갱신 필요
    }

