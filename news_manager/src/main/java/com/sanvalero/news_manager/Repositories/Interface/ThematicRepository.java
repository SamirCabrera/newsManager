package com.sanvalero.news_manager.Repositories.Interface;

import com.sanvalero.news_manager.Repositories.Entities.Thematic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ThematicRepository extends JpaRepository<Thematic, Long> {
    
}
