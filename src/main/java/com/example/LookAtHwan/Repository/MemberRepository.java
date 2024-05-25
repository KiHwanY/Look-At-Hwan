package com.example.LookAtHwan.Repository;

import com.example.LookAtHwan.Entity.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberVO, Long> {
}
