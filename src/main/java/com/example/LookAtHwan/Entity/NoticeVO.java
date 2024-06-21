package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "tb_notice")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NT_KEY")
    private Long ntKey;
    @Column(name = "NT_TITLE" , length = 200)
    private String ntTitle;
    @Column(name = "NT_WRITER" , length = 30)
    private String ntWriter;
    @Column(name = "NT_IMG" , length = 500)
    private String ntImg;
    @Column(name = "NT_HIT")
    private String ntHit;
    @Column(name = "NT_CONTENT" , length = 2000)
    private String ntContent;

    @Embedded
    private Period period;


}
