package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class VideoRepository implements VideoRepositoryInterface {
    ArrayList<Video> videos = new ArrayList<>();

    @Override
    public void add (Video video){
        videos.add(video);
    }

    @Override
    public Video getVideo(String id){
        Video target = null;
        for (Video video : videos){
            if (video.getId().equals(id)){
                target = video;
            }
        }
        return target;
    }

    @Override
    public void deleteVideo(String id){
        for (Video video : videos){
            if (video.getId().equals(id)){
                videos.remove(video);
            }
        }
    }

    @Override
    public ArrayList<Video> getVideos() {
        return videos;
    }

    public void setVideos(ArrayList<Video> videos) {
        this.videos = videos;
    }
}
