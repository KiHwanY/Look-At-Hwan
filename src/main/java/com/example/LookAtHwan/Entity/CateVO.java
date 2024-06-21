package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;

@Entity(name = "tb_cate")
public class CateVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATE_KEY")
    private Long cKey;
    @Column(name = "SESSION_ID" , length = 200)
    private String sessionId;
    @Column(name = "CATE_CNT")
    private Integer cateCnt;

    @Embedded
    private Period period;



}
