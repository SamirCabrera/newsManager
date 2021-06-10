package com.sanvalero.news_manager.Services;

import com.sanvalero.news_manager.Repositories.Interface.NewsRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class NewsServices {
    
    @Autowired
    private NewsRepository newsRepository;

    
}
