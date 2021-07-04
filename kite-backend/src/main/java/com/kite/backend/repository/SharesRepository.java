package com.kite.backend.repository;

import com.kite.backend.model.Shares;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SharesRepository extends JpaRepository<Shares, Long> {
}
