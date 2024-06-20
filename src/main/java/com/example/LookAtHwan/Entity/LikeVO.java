package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity(name = "tb_like")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LikeVO {

    @Embedded
    private Period period;

}
