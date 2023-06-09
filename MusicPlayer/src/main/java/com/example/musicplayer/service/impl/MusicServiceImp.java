package com.example.musicplayer.service.impl;

import com.example.musicplayer.model.Music;
import com.example.musicplayer.repository.MusicRepository;
import com.example.musicplayer.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicServiceImp implements IMusicService {
    @Autowired
    private MusicRepository musicRepository;

    public MusicServiceImp() {
    }

    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(int id) {
        return musicRepository.findById(id);
    }

    @Override
    public void save(String name) {
//        return
        musicRepository.save(new Music(name));
    }
}
