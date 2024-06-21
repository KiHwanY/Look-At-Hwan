package com.example.LookAtHwan.VoTest;

import com.example.LookAtHwan.Entity.MemberVO;
import com.example.LookAtHwan.Entity.ValueObject.Period;
import com.example.LookAtHwan.Repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberEntityTest {
    @Autowired
    MemberRepository memberRepository;


    @Test
    public void insertMember() {
//        IntStream.rangeClosed(1, 10).forEach(i -> {
//            Period test = new Period();
//            test.setCreateDt(LocalDateTime.now());
//            MemberVO member = MemberVO.builder().userId("period" + i).period(test).
//                    build();
           Period test = new Period();
            test.setCreateDt(LocalDateTime.now());
            MemberVO member = MemberVO.builder().userId("user").userPw("1234").period(test).
                    build();

        memberRepository.save(member);
//        });
    }

    @Test
    public void SelectMemberTest(){

        Long id = 9L;

        Optional<MemberVO> result = memberRepository.findById(id);

        System.out.println("==================================");

        if(result.isPresent()){
            MemberVO member = result.get();
            System.out.println(member);
        }
    }
    @Test
    public void UpdateMemberTest(){
        Period test = new Period();
        test.setUpdateDt(LocalDateTime.now());

        MemberVO member = MemberVO.builder().userKey(30L).userNm("ValueObjectUpdateTest").period(test).zipcode(123456).addrBasic("테스트동").addrDetail("103동 1005호").
                build();

        memberRepository.save(member);
    }
    @Test
    public void DeleteMemberTest(){
        Long id = 10L;

        memberRepository.deleteById(id);
    }
}
