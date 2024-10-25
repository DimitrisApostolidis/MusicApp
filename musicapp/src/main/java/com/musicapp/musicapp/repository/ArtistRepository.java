package com.musicapp.musicapp.repository;

import com.musicapp.musicapp.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}