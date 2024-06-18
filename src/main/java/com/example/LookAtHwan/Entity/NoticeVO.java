package com.example.LookAtHwan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoticeVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ntKey;

    private String ntTitle;

    private String ntWriter;

    private String ntImg;

    private String ntHit;

    private String ntContent;

    
}
