package ua.dizaer.site.service;

import java.io.File;
import java.util.List;

public interface VideoService {
    File getVideo(String video);
    List<String> getListVideo();
}
