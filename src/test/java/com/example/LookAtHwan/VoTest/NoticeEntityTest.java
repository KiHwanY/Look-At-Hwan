package com.example.LookAtHwan.VoTest;

import com.example.LookAtHwan.Entity.NoticeVO;
import com.example.LookAtHwan.Entity.ValueObject.Period;
import com.example.LookAtHwan.Repository.NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class NoticeEntityTest {

    @Autowired
    NoticeRepository noticeRepository;


    @Test
    public void insertNoticeTest() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Period test = new Period();
            test.setCreateDt(LocalDateTime.now());
            NoticeVO notice = NoticeVO.builder().ntWriter("period" + i).period(test).
                    build();

            noticeRepository.save(notice);
        });
    }

    @Test
    public void SelectNoticeTest(){

        Long id = 9L;

        Optional<NoticeVO> result = noticeRepository.findById(id);

        System.out.println("==================================");

        if(result.isPresent()){
            NoticeVO notice = result.get();
            System.out.println(notice);
        }
    }
    @Test
    public void UpdateNoticeTest(){
        Period test = new Period();
        test.setUpdateDt(LocalDateTime.now());

        NoticeVO board = NoticeVO.builder().ntKey(10L).ntWriter("ValueObjectUpdateTest").period(test).
                build();

        noticeRepository.save(board);
    }
    @Test
    public void DeleteNoticeTest(){
        Long id = 10L;

        noticeRepository.deleteById(id);
    }

}
