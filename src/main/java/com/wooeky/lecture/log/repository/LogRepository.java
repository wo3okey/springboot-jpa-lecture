package com.wooeky.lecture.log.repository;

import com.wooeky.lecture.log.entity.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<Log, Long> {
}
