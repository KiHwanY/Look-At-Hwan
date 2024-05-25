package com.example.LookAtHwan.VoTest;

import com.example.LookAtHwan.Entity.MemberVO;
import com.example.LookAtHwan.Entity.User;
import com.example.LookAtHwan.Entity.ValueObject.Period;
import com.example.LookAtHwan.Repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberEntityTest {
    @Autowired
    MemberRepository memberRepository;


    @Test
    public void insertMember() {
        IntStream.rangeClosed(1, 10).forEach(i -> {

            MemberVO member = MemberVO.builder().userNm("period" + i).period(new Period()).
                    build();

            memberRepository.save(member);
        });
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
        LocalDateTime now =LocalDateTime.now();
        MemberVO member = MemberVO.builder().userKey(8L).userNm("LocalTimeTest").
                build();

        memberRepository.save(member);
    }
    @Test
    public void DeleteMemberTest(){
        Long id = 10L;

        memberRepository.deleteById(id);
    }
}
