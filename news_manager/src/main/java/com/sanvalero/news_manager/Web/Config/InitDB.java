package com.sanvalero.news_manager.Web.Config;

import com.sanvalero.news_manager.Repositories.Entities.News;
import com.sanvalero.news_manager.Repositories.Entities.Tags;
import com.sanvalero.news_manager.Repositories.Entities.Thematic;
import com.sanvalero.news_manager.Repositories.Interface.NewsRepository;
import com.sanvalero.news_manager.Repositories.Interface.TagsRepository;
import com.sanvalero.news_manager.Repositories.Interface.ThematicRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitDB {
    
    @Bean
    CommandLineRunner initDatabase(NewsRepository RNews, ThematicRepository RThematic, TagsRepository RTags) {

        return args -> {

            RNews.save(new News());
            RNews.save(new News());

            RThematic.save(new Thematic());
            RThematic.save(new Thematic());

            RTags.save(new Tags());
            RTags.save(new Tags());

        };
    }
}
