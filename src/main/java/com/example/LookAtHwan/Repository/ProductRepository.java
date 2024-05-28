package com.example.LookAtHwan.Repository;

import com.example.LookAtHwan.Entity.ProductVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductVO, Long> {
}
