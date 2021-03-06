package fr.mydeos.core.service;

import fr.mydeos.core.entity.Video;

import java.util.ArrayList;
import java.util.List;

public interface VideoServiceInterface {

    public void addVideo(Video video, String filename, String id);

    public Video getVideoById(String id);

    public ArrayList<Video> getVideos();


}
