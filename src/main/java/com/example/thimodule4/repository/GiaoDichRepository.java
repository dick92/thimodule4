package com.example.thimodule4.repository;

import com.example.thimodule4.entity.GiaoDich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaoDichRepository extends JpaRepository<GiaoDich, Long> {
}
