package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;

import java.util.ArrayList;

public class VideoRepository {
    ArrayList<Video> videos = new ArrayList<>();

    public void add (Video video){
        videos.add(video);
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
}
