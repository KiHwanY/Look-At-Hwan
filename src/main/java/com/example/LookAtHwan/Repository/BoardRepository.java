package com.example.LookAtHwan.Repository;

import com.example.LookAtHwan.Entity.BoardVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardVO, Long> {
}
