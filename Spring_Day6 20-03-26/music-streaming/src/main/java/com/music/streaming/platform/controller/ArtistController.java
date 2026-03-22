package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/artists")
public class ArtistController {
    @Autowired
    private ArtistService artistService;

    @PostMapping
    public Artist createNewArtist(@RequestBody ArtistRequest artistRequest){
        return artistService.createArtist(artistRequest);
    }
    @GetMapping
    public ResponseEntity<List<Artist>> getAllArtists() {
        return new ResponseEntity<>(artistService.getAllArtists(), HttpStatus.OK);
    }
    @GetMapping("/{artistId}")
    public ResponseEntity<Artist> getArtistById(@PathVariable Long artistId) {
        Artist artist = artistService.getArtistById(artistId);
        return new ResponseEntity<>(artist,HttpStatus.OK);
    }
    @PutMapping("/{artistId}")
    public ResponseEntity<Artist> updateArtistById(@PathVariable Long artistId, @RequestBody ArtistRequest a) {
        return new ResponseEntity<>(artistService.updateArtist(artistId, a), HttpStatus.OK);
    }
    @DeleteMapping("/{artistId}")
    public ResponseEntity removeArtistById(@PathVariable Long artistId) {
        artistService.deleteArtist(artistId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
