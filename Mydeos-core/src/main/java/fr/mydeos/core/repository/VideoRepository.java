package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;

import java.util.ArrayList;

public class VideoRepository implements VideoRepositoryInterface {
    ArrayList<Video> videos = new ArrayList<>();

    public void add (Video video){
        videos.add(video);
    }

    public Video getVideo(String id){
        Video target = null;
        for (Video video : videos){
            if (video.getId().equals(id)){
                target = video;
            }
        }
        return target;
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
}
