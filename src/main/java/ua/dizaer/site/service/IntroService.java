package ua.dizaer.site.service;

import ua.dizaer.site.model.entity.Intro;

import java.util.List;

public interface IntroService {
    Intro findOne(String string);
    Intro getRandomIntro();
    List<Intro> findAll();
    Intro findByPosterName(String posterName);
}
