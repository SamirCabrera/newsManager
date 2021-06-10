package com.sanvalero.news_manager.Services;

import com.sanvalero.news_manager.Repositories.Interface.TagsRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class TagsServices {
    
    @Autowired
    private TagsRepository tagsRepository;
}
