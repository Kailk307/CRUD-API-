package com.example.example3.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.example3.entity.OderDetail;

public interface OderDetailRepository extends JpaRepository<OderDetail, Long> {
    Page<OderDetail> findAll(Pageable pageable);
}
