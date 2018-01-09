package ua.dizaer.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dizaer.site.component.FileBrowserComponent;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.repository.IntroRepository;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service("introSrvice")
public class IntroServiceImpl implements IntroService {
    @Autowired
    private IntroRepository introRepository;

    @Autowired
    private FileBrowserComponent videoFileComponent;

    @Override
    public Intro findOne(String name) {
        return findAll().stream().filter(intro->intro.getName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public Intro getRandomIntro() {
        return null;
    }

    @Override
    public List<Intro> findAll() {
        Map<String, File> videos = videoFileComponent.getVideos();
        return videos.keySet().stream().map(vf->{
            String introName=vf.split("\\.")[0];
            String posterName=introName+"."+Intro.POSTER_FORMAT;
            String videoName=vf;
            return new Intro(introName,posterName,videoName);
        }).collect(Collectors.toList());
    }

    @Override
    public Intro findByPosterName(String posterName) {
        return findAll().stream().filter(s->s.getPosterName().equals(posterName)).findFirst().orElse(null);
    }
}
