package com.sanvalero.news_manager.Repositories.Entities;

import java.util.ArrayList;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "News")
public class News {
    
    private @Id Long id;
    private Thematic thematic;
    private ArrayList<Tags> tags = new ArrayList<Tags>();

    public News() { }

    

}   

