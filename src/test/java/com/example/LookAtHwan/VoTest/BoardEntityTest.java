package com.example.LookAtHwan.VoTest;

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

//
//    @Test
//    public void insertProduct() {
//        IntStream.rangeClosed(1, 10).forEach(i -> {
//            Period test = new Period();
//            test.setCreateDt(LocalDateTime.now());
//            ProductVO product = ProductVO.builder().proNm("period" + i).period(test).
//                    build();
//
//            productRepository.save(product);
//        });
//    }
//
//    @Test
//    public void SelectProductTest(){
//
//        Long id = 9L;
//
//        Optional<ProductVO> result = productRepository.findById(id);
//
//        System.out.println("==================================");
//
//        if(result.isPresent()){
//            ProductVO product = result.get();
//            System.out.println(product);
//        }
//    }
//    @Test
//    public void UpdateProductTest(){
//        Period test = new Period();
//        test.setUpdateDt(LocalDateTime.now());
//
//        ProductVO product = ProductVO.builder().proKey(10L).proNm("ValueObjectUpdateTest").period(test).
//                build();
//
//        productRepository.save(product);
//    }
//    @Test
//    public void DeleteProductTest(){
//        Long id = 10L;
//
//        productRepository.deleteById(id);
//    }

}
