package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
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

    public void deleteVideo(String id){
        for (Video video : videos){
            if (video.getId().equals(id)){
                videos.remove(video);
            }
        }
    }

    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
}
