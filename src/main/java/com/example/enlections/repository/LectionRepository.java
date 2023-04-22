package com.example.enlections.repository;

import com.example.enlections.entity.Lection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LectionRepository extends JpaRepository<Lection,Long> {
}
