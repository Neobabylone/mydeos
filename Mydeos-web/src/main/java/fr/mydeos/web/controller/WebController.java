package fr.mydeos.web.controller;

import fr.mydeos.core.entity.Video;
import fr.mydeos.core.service.VideoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Controller
public class WebController {

    @Autowired
    private VideoServiceInterface service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam("file") MultipartFile file, Model model) {


        String fileName = file.getOriginalFilename();

        try {
            file.transferTo(new File("C:\\test\\" + fileName));
        } catch (Exception e) {
            return "error";
        }
        Video video = new Video();
        String videoURL = "..\\" + fileName;
        service.addVideo(video, videoURL);

        String url = "http://127.0.0.1:8080/watch/" + video.getId();
        model.addAttribute("url", url);
        return "add";
    }


    @RequestMapping("/watch/{id}")
    public String watchVideo(@PathVariable("id") String id, Model model){
        model.addAttribute("video", service.getVideoById(id).getFilename());
        System.out.println(service.getVideoById(id));
        return "watch";
    }
}
