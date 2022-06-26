package fr.mydeos.core.service;

import fr.mydeos.core.entity.Video;
import fr.mydeos.core.repository.VideoRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class VideoService implements VideoServiceInterface {

    @Autowired
    private VideoRepositoryInterface repository;

    private String uniqueID;

    @Override
    public void addVideo(Video video, String filename, String id) {
        video.setId(id);
        video.setFilename(filename);
        repository.add(video);
    }

    @Override
    public ArrayList<Video> getVideos() {
        return repository.getVideos();
    }

    @Override
    public Video getVideoById(String id) {
        return repository.getVideo(id);
    }

    public VideoRepositoryInterface getRepository() {
        return repository;
    }

    public void setRepository(VideoRepositoryInterface repository) {
        this.repository = repository;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }
}
