package com.sanvalero.news_manager.Repositories.Entities;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Tags")
public class Tags {

    private @Id Long id;
    private String name;

    public Tags() { }
    
}
