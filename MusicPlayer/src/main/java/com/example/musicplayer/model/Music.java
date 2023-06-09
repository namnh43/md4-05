package com.example.musicplayer.model;

import javax.persistence.*;

@Entity
@Table(name = "Music")
@NamedQuery(name = "FIND_BY_ID",query = "from Music where id = :id")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String path;

    public Music() {
    }

    public Music(String name) {
        this.name = name;
    }

    public Music(int id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
