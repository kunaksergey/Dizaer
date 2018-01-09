package ua.dizaer.site.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Component
public class FileBrowserComponent {
    private String videoLocation = "videos";
    private String posterLocation = "posters";
    private Map<String, File> videos = new HashMap<String, File>();
    private Map<String, File> posters = new HashMap<String, File>();

    @PostConstruct
    public void init() {
        File dirVideo = new File(videoLocation);
        videos.clear();
        videos.putAll(Arrays.asList(dirVideo.listFiles()).stream()
                .collect(Collectors.toMap((f) -> {
                    String name = ((File) f).getName();
                    return name;
                }, (f) -> (File) f)));

        File dirPoster = new File(posterLocation);
        posters.clear();
        posters.putAll(Arrays.asList(dirPoster.listFiles()).stream()
                .collect(Collectors.toMap((f) -> {
                    String name = ((File) f).getName();
                    return name;
                }, (f) -> (File) f)));


    }

    public Map<String, File> getVideos() {
        return videos;
    }

    public Map<String, File> getPosters() {
        return posters;
    }
}
