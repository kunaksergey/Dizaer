package ua.dizaer.site.service;

import ua.dizaer.site.model.entity.Intro;

import java.util.List;

public interface IntroService {
    Intro findByName(String string);
    Intro randomIntro();
    List<Intro> findAll();
    Intro findByPosterName(String posterName);
    List<Intro> randomRangeListIntro();
}
