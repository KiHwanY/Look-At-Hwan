package com.example.LookAtHwan.Entity.ValueObject;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Embeddable
public class Period {

    @Column(name = "CREATE_DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime createDt; // 생성 일자
    @Column(name = "UPDATE_DATE" )
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime updateDt; // 수정 일자

    public Period() {}

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }
}
