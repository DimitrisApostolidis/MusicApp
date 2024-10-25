package com.musicapp.musicapp.controller;

import com.musicapp.musicapp.model.Artist;
import com.musicapp.musicapp.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artists")
public class ArtistController {

    private final ArtistService artistService;

    // Constructor injection αντί για field injection
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @PostMapping
    public Artist addArtist(@RequestBody Artist artist) {
        return artistService.addArtist(artist);
    }

    @DeleteMapping("/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.deleteArtist(id);
    }
}
