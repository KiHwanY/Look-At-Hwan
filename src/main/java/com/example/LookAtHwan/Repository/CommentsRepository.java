package com.example.LookAtHwan.Repository;

import com.example.LookAtHwan.Entity.CommentsVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<CommentsVO, Long> {
}
