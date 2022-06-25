package fr.mydeos.core.service;

import fr.mydeos.core.entity.Video;

import java.util.List;

public interface VideoServiceInterface {

    public void addVideo(Video video);

    public Video getVideoById(String id);


}
