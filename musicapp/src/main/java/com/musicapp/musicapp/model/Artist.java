package com.musicapp.musicapp.model;

import javax.persistence.*;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bio;
    private String imageUrl;
}
