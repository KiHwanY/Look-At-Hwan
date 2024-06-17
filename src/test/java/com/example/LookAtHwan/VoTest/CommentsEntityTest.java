package com.example.LookAtHwan.VoTest;

import com.example.LookAtHwan.Entity.CommentsVO;
import com.example.LookAtHwan.Entity.ValueObject.Period;
import com.example.LookAtHwan.Repository.CommentsRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class CommentsEntityTest {

    @Autowired
    CommentsRepository comments;


    @Test
    public void insertCommentsTest() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Period test = new Period();
            test.setCreateDt(LocalDateTime.now());
            CommentsVO comment = CommentsVO.builder().cWriter("period" + i).period(test).
                    build();

            comments.save(comment);
        });
    }

    @Test
    public void SelectCommentsTest(){

        Long id = 9L;

        Optional<CommentsVO> result = comments.findById(id);

        System.out.println("==================================");

        if(result.isPresent()){
            CommentsVO comment = result.get();
            System.out.println(comment);
        }
    }
    @Test
    public void UpdateCommentsTest(){
        Period test = new Period();
        test.setUpdateDt(LocalDateTime.now());

        CommentsVO board = CommentsVO.builder().cKey(10L).cWriter("ValueObjectUpdateTest").period(test).
                build();

        comments.save(board);
    }
    @Test
    public void DeleteCommentsTest(){
        Long id = 10L;

        comments.deleteById(id);
    }

}
