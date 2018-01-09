package ua.dizaer.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dizaer.site.model.entity.Intro;


public interface IntroRepository extends JpaRepository<Intro,Integer> {
    Intro findByName(String string);
}

