package com.sanvalero.news_manager.Web.Config;
import com.sanvalero.news_manager.Services.NewsServices;
import com.sanvalero.news_manager.Services.TagsServices;
import com.sanvalero.news_manager.Services.ThematicServices;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DI {
    
    @Bean
    NewsServices createNewsServices() {
        return new NewsServices();
    }

    @Bean
    ThematicServices createThematicServices() {
        return new ThematicServices();
    }

    @Bean
    TagsServices createTagsServices() {
        return new TagsServices();
    }
}
