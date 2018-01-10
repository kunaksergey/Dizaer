package ua.dizaer.site.component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class FileBrowserComponent {
    private String videoLocation = "videos";
    private String posterLocation = "posters";
    private String bannerLocation = "banners";
    private Map<String, File> videos = new HashMap<String, File>();
    private Map<String, File> posters = new HashMap<String, File>();
    private Map<String, File> banners = new HashMap<String, File>();

    @PostConstruct
    public void init() {
        //video
        File dirVideo = new File(videoLocation);
        videos.clear();
        videos.putAll(mapFiles(dirVideo));

        //posters
        File dirPoster = new File(posterLocation);
        posters.clear();
        posters.putAll(mapFiles(dirPoster));

        //banners
        File dirBanners = new File(bannerLocation);
        banners.clear();
        banners.putAll(mapFiles(dirBanners));

    }

    private Map<String, File> mapFiles(File dir) {
        Map<String, File> map = new HashMap<>();
        if (dir.isDirectory()) {
            return Arrays.asList(dir.listFiles()).stream()
                    .collect(Collectors.toMap((f) -> {
                        String name = ((File) f).getName();
                        return name;
                    }, (f) -> (File) f));
        }
        return map;
    }

    public Map<String, File> getVideos() {
        return videos;
    }

    public Map<String, File> getPosters() {
        return posters;
    }

    public Map<String, File> getBanners() {
        return banners;
    }

}
