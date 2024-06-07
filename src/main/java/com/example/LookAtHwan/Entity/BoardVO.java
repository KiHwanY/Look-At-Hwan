package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_board")
public class BoardVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOARD_KEY")
    private Long bKey;
    @Column(name = "BD_TYPE",length = 1)
    private String bType;
    @Column(name = "BD_TITLE",length = 200)
    private String bTitle;
    @Column(name = "BD_WRITER" , length = 30)
    private String bWriter;
    @Column(name = "BD_IMG" , length = 500)
    private String bImg;
    @Column(name = "BD_HIT")
    private Integer bHit;
    @Column(name = "BD_CONTENT" , length = 2000)
    private String bContent;
    @Column(name = "RATE")
    private Integer rate;
    @Embedded
    private Period period;


}
