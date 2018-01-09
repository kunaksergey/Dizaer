package ua.dizaer.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dizaer.site.component.FileBrowserComponent;
import ua.dizaer.site.model.entity.Intro;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

@Service("videoService")
public class VideoServiceImpl implements VideoService {

    @Autowired
    private IntroService introService;

    @Autowired
    private FileBrowserComponent fileBrowserComponent;

    @Override
    public File getVideo(String video) {
        return fileBrowserComponent.getVideos().get(video);
    }

    @Override
    public List<String> getListVideo() {
        return introService.findAll().stream().map(Intro::getVideoName).collect(Collectors.toList());
    }
}
