package fr.mydeos.web.controller;

import fr.mydeos.core.entity.Video;
import fr.mydeos.core.service.VideoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class AddController {

    @Autowired
    private VideoServiceInterface service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> add(@RequestParam("file") MultipartFile file) {


        String fileName = file.getOriginalFilename();

        try {
            file.transferTo(new File("C:\\test\\" + fileName));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        Video video = new Video();
        service.addVideo(video);
        return ResponseEntity.ok(video.toString());
    }
}
