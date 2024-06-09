package com.example.LookAtHwan.VoTest;

import com.example.LookAtHwan.Entity.BoardVO;
import com.example.LookAtHwan.Entity.ProductVO;
import com.example.LookAtHwan.Entity.ValueObject.Period;
import com.example.LookAtHwan.Repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardEntityTest {

    @Autowired
    BoardRepository boardRepository;


    @Test
    public void insertBoardTest() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            Period test = new Period();
            test.setCreateDt(LocalDateTime.now());
            BoardVO board = BoardVO.builder().bTitle("period" + i).period(test).
                    build();

            boardRepository.save(board);
        });
    }

    @Test
    public void SelectBoardTest(){

        Long id = 9L;

        Optional<BoardVO> result = boardRepository.findById(id);

        System.out.println("==================================");

        if(result.isPresent()){
            BoardVO board = result.get();
            System.out.println(board);
        }
    }
    @Test
    public void UpdateBoardTest(){
        Period test = new Period();
        test.setUpdateDt(LocalDateTime.now());

        BoardVO board = BoardVO.builder().bKey(10L).bTitle("ValueObjectUpdateTest").period(test).
                build();

        boardRepository.save(board);
    }
    @Test
    public void DeleteBoardTest(){
        Long id = 10L;

        boardRepository.deleteById(id);
    }

}
