package com.example.LookAtHwan.UserTest;

import com.example.LookAtHwan.Entity.User;
import com.example.LookAtHwan.Repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void InsertUserTest(){
        IntStream.rangeClosed(1,10).forEach(i ->{
            User user = User.builder().name("test"+i).
                    build();

            userRepository.save(user);
        });
    }
    @Test
    public void SelectUserTest(){

        Long id = 10L;

        Optional<User> result = userRepository.findById(id);

        System.out.println("==================================");

        if(result.isPresent()){
            User user = result.get();
            System.out.println(user);
        }
    }

    @Test
    public void UpdateUserTest(){
            User user = User.builder().id(10L).name("testUpdateName").
                    build();

            userRepository.save(user);
    }
    @Test
    public void DeleteUserTest(){
        Long id = 10L;

        userRepository.deleteById(id);
    }
}
