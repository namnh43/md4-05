package com.example.musicplayer.controllers;

import com.example.musicplayer.model.Music;
import com.example.musicplayer.service.IMusicService;
import com.example.musicplayer.service.MusicService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService musicService;
    @GetMapping
    public String listMusics(Model model) {
        List<Music> list = musicService.findAll();
        model.addAttribute("list", list);
        return "index";
    }
    @GetMapping("/views/{id}")
    public ModelAndView viewItem(@PathVariable int id) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("musicItem",musicService.findById(id));
        return modelAndView;
    }
    @PostMapping("/save")
    public String saveItem(@RequestParam String name, Model model) {
        ModelAndView modelAndView = new ModelAndView("index");
        musicService.save(name);
        List<Music> list = musicService.findAll();
        model.addAttribute("list", list);
        return "redirect:/music";
    }
}
