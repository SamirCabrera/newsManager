package com.sanvalero.news_manager.Repositories.Interface;

import com.sanvalero.news_manager.Repositories.Entities.News;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long>{
    
}
