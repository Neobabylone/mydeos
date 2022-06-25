package fr.mydeos.core.repository;

import fr.mydeos.core.entity.Video;

public interface VideoRepositoryInterface {
    public void add(Video video);
    public Video getVideo(String id);
    public void deleteVideo(String id);
}
