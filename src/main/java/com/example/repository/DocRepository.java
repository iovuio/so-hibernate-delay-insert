package com.example.repository;

import com.example.model.Table;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<Table, Long> {
}
