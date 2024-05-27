package com.example.LookAtHwan.Entity;

import com.example.LookAtHwan.Entity.ValueObject.Period;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "TB_MEMBER")
public class MemberVO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_KEY")
    private Long userKey; // 회원 고유 번호

//    private Long ADMIN_KEY; // 관리자 고유 번호
//    @Column(length = 30 , name = "USER_ID" )
//    private String userId; // 회원 아이디
//    @Column(length = 200 , name = "USER_PW")
//    private String userPw; // 회원 비밀번호
    @Column(length = 30 , name = "USER_NM")
    private String userNm; // 회원 이름
//    @Column(length = 50, name = "USER_NICKNAME")
//    private String userNickName; // 회원 닉네임
//    @Column(length = 30, name = "USER_BIRTH")
//    private String userBirth; // 생년월일
//    @Column(length = 10,name = "USER_PHONE")
//    private String userPhone; // 전화번호
//    @Column(length = 1 , name = "USER_CK")
//    private String userCk; // 회원 권한
    @Column(length = 6 , name = "ZIPCODE")
    private Integer zipcode; // 우편 번호
    @Column(length = 100 , name ="ADDRESS_BASIC" )
    private String addrBasic; // 기본 주소
    @Column(length = 100 , name = "ADDRESS_DETAIL")
    private String addrDetail; // 상세 주소
//    @Column(name = "CREATE_DATE")
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//    private LocalDateTime createDt; // 생성 일자
//    @Column(name = "UPDATE_DATE" )
//    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
//    private LocalDateTime updateDt; // 수정 일자
    @Embedded
    private Period period;
}
