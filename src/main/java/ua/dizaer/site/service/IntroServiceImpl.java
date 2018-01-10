package ua.dizaer.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.dizaer.site.component.FileBrowserComponent;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.model.entity.IntroDetails;
import ua.dizaer.site.repository.IntroRepository;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Service("introSrvice")
public class IntroServiceImpl implements IntroService {
    private final int RANGE = 9;
    @Autowired
    private IntroRepository introRepository;

    @Autowired
    private FileBrowserComponent fileBrowserComponent;

    @Override
    public Intro findByName(String name) {
        Intro intro = introRepository.findByName(name);
        if (intro == null) {
            intro = findAll().stream().filter(i -> i.getName().equals(name)).findFirst().orElse(new Intro());
            intro.setIntroDetails(new IntroDetails());
        }
        return intro;
    }

    @Override
    public Intro randomIntro() {
        List<Intro> listIntro = findAll();
        if (listIntro.size() == 0) return new Intro();
        Integer randonVideoIndex = new Random().nextInt(listIntro.size());
        return listIntro.get(randonVideoIndex);
    }

    @Override
    public List<Intro> findAll() {
        Map<String, File> videoMap = fileBrowserComponent.getVideos();
        if (videoMap.keySet().size() == 0) return new ArrayList<>();
        return videoMap.keySet().stream().map(vf -> {
            String introName = vf.split("\\.")[0];
            String posterName = introName + "." + Intro.POSTER_FORMAT;
            String videoName = vf;
            return new Intro(introName, posterName, videoName);
        }).collect(Collectors.toList());

    }

    @Override
    public Intro findByPosterName(String posterName) {
        return findAll().stream().filter(s -> s.getPosterName().equals(posterName)).findFirst().orElse(null);
    }

    @Override
    public List<Intro> randomRangeListIntro() {
        List<Intro> listIntro = findAll();
        if (listIntro.size() == 0) return new ArrayList<>();
        List<Intro> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < RANGE; i++) {
            int randomIndex = random.nextInt(listIntro.size() - 1);
            randomList.add(listIntro.get(randomIndex));
            listIntro.remove(randomIndex);
        }
        return randomList;
    }
}
