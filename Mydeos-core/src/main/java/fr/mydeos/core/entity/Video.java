package fr.mydeos.core.entity;

public class Video {
    String id;
    String filename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", filename='" + filename + '\'' +
                '}';
    }
}
