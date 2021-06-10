package com.sanvalero.news_manager.Repositories.Interface;

import com.sanvalero.news_manager.Repositories.Entities.Tags;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tags, Long>{
    
}
