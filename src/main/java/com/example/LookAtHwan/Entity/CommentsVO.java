package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_comments")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentsVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COM_KEY")
    private Long cKey; // 댓글 고유 번호
    @Column(name = "COM_WRITER" , length = 30)
    private String cWriter; // 작석자
    @Column(name = "COM_CONTENT" , length = 2000)
    private String cContent; // 내용

    @Embedded
    private Period period;

    
}
