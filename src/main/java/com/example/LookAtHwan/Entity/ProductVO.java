package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "TB_PRODUCT")
public class ProductVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_KEY")
    private Long proKey; // 상품 고유 번호
    @Column(length = 30, name = "PRO_NM")
    private String proNm;
    @Column(length = 30, name = "PRO_PRICE")
    private String proPrice;
    @Column(length = 1000, name = "PRO_CONTENT")
    private String proContent;
    @Column(length = 1, name = "PRO_YN")
    private String proYn;
    @Column(length = 30, name = "PRO_CNT")
    private Integer proCnt;
    @Column(length = 30, name = "PRO_QTY")
    private Integer proQty;
    @Column(length = 30, name = "PRO_SIZE")
    private String proSize;
    @Column(length = 30, name = "PRO_COLOR")
    private String proColor;
    @Column(length = 500, name = "PRO_IMG1")
    private String proImg1;
    @Column(length = 500, name = "PRO_IMG2")
    private String proImg2;
    @Column(length = 500, name = "PRO_IMG3")
    private String proImg3;
    @Column(length = 500, name = "PRO_IMG4")
    private String proImg4;
    @Column(length = 500, name = "PRO_IMG5")
    private String proImg5;
    @Column(length = 1, name = "PRO_DELETED")
    private String proDeleted;
    @Embedded
    private Period period;




}
