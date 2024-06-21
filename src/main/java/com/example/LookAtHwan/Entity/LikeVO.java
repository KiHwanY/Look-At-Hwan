package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "tb_like")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LikeVO {
    @Id
    private Long id;
    @Embedded
    private Period period;

}
