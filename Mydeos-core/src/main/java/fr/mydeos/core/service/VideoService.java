package fr.mydeos.core.service;

import fr.mydeos.core.entity.Video;
import fr.mydeos.core.repository.VideoRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class VideoService implements VideoServiceInterface {

    @Autowired
    private VideoRepositoryInterface repository;

    private String uniqueID;

    @Override
    public void addVideo(Video video) {
        video.setId(uniqueID = UUID.randomUUID().toString());

        repository.add(video);
    }

}
