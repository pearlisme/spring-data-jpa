package com.pearl.data.Repository;

import com.pearl.data.domain.Bug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BugRepository extends JpaRepository<Bug,Long> {
}
