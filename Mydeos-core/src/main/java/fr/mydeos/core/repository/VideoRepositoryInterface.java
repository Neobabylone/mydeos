package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;

import java.util.ArrayList;

public interface VideoRepositoryInterface {
    public void add(Video video);
    public Video getVideo(String id);

    public ArrayList<Video> getVideos();
    public void deleteVideo(String id);
}
