package com.musicapp.musicapp.service;

import com.musicapp.musicapp.model.Artist;
import com.musicapp.musicapp.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Artist addArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
