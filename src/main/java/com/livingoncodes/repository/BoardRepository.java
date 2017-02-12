package com.livingoncodes.repository;

import com.livingoncodes.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sudip sarker on 2/12/2017.
 */
public interface BoardRepository extends JpaRepository<Board, Long> {
    public Board findByName(String name);
}
