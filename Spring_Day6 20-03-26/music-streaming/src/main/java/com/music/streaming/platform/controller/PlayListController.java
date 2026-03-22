package com.music.streaming.platform.controller;

import com.music.streaming.platform.dto.PlayListRequest;
import com.music.streaming.platform.model.PlayList;
import com.music.streaming.platform.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/music/platform/v1/playlists")
public class PlayListController {
    @Autowired
    private PlayListService playListService;
    @PostMapping
    public PlayList createPlayList(@RequestBody PlayListRequest playListRequest){
        return playListService.createPlayList(playListRequest);
    }
    @GetMapping("/{artistId}")
    public ResponseEntity<PlayList> getPlayListById(@PathVariable Long artistId) {
        return new ResponseEntity<>(playListService.getPlayListById(artistId), HttpStatus.OK);
    }
    @DeleteMapping("/{artistId}")
    public ResponseEntity deletePlayListById(@PathVariable Long artistId) {
        playListService.deletePlayList(artistId);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
