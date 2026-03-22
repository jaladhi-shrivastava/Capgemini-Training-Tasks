package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.ArtistRequest;
import com.music.streaming.platform.dto.TrackRequest;
import com.music.streaming.platform.model.Artist;
import com.music.streaming.platform.model.Track;
import com.music.streaming.platform.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music/platform/v1/tracks")
public class TrackController {
    @Autowired
    private TrackService trackService;
    @PostMapping
    public Track createTrack(@RequestBody TrackRequest trackRequest){
        return trackService.createTrack(trackRequest);
    }
    @GetMapping
    public ResponseEntity<List<Track>> getAllTracks() {
        return new ResponseEntity<>(trackService.getAllTracks(), HttpStatus.OK);
    }
    @GetMapping("/{trackId}")
    public ResponseEntity<Track> getTrackById(@PathVariable Long trackId){
        return new ResponseEntity<>(trackService.getTrackById(trackId),HttpStatus.OK);
    }
    @PutMapping("/{trackId}")
    public ResponseEntity<Track> updateTrack(@PathVariable Long trackId, @RequestBody TrackRequest trackRequest) {
        return new ResponseEntity<>(trackService.updateTrack(trackId, trackRequest), HttpStatus.OK);
    }
    @DeleteMapping("/{trackId}")
    public ResponseEntity deleteTrack(@PathVariable Long trackId) {
        trackService.deleteTrack(trackId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
