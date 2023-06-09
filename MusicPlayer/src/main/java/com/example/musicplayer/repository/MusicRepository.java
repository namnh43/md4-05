package com.example.musicplayer.repository;

import com.example.musicplayer.model.Music;

import javax.transaction.Transactional;
import java.util.List;

public interface MusicRepository {
    Music findById(int id);
    List<Music> findAll();
    @Transactional
    void save(Music name);
}
