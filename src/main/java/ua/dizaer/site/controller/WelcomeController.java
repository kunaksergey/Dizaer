package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.service.IntroService;
import ua.dizaer.site.service.VideoService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


@Controller
@RequestMapping("/")
public class WelcomeController {
    @Autowired
    private IntroService introService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView welcome(ModelAndView modelAndView){
        List<Intro> listIntro=introService.findAll();
        Integer randonVideoIndex=new Random().nextInt(listIntro.size());
        modelAndView.addObject("introRandom", listIntro.get(randonVideoIndex));
        modelAndView.addObject("intros", introService.findAll());
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
