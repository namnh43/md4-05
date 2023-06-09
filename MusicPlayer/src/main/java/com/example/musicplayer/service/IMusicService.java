package com.example.musicplayer.service;

import com.example.musicplayer.model.Music;

import java.util.List;

public interface IMusicService {
    List<Music> findAll();
    Music findById(int id);
    void save(String name);
}
