package com.sanvalero.news_manager.Repositories.Entities;

import java.util.ArrayList;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Thematic")
public class Thematic {
    
    private @Id Long id;
    private ArrayList<News> news = new ArrayList<News>();
    
    public Thematic() { }
    
}
