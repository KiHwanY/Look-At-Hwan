package com.example.LookAtHwan.Repository;

import com.example.LookAtHwan.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {


}
