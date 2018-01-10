package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.service.IntroService;

import java.util.List;

@Controller
@RequestMapping("/intro")
public class IntroController {

    @Autowired
    private IntroService introService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView showList(ModelAndView modelAndView) {
        modelAndView.addObject("intros", introService.findAll());
        modelAndView.setViewName("introList");
        return modelAndView;
    }


    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseBody
    Intro showOne(@PathVariable String name) {
        return introService.findByName(name);
    }

    @RequestMapping(value = "/range", method = RequestMethod.GET)
    @ResponseBody
    List<Intro> showRange() {
        return null;

    }

    @RequestMapping(value = "/showMore", method = RequestMethod.GET)
    @ResponseBody
    List<Intro> showMore() {
        List<Intro> listIntro = introService.findAll();
        return listIntro.subList(10, listIntro.size() - 1);
    }


    @RequestMapping(value = "/{name}/edit", method = RequestMethod.GET)
    ModelAndView edit(@PathVariable String name, ModelAndView modelAndView) {
        Intro intro = introService.findByName(name);
        if (intro.getName() == null) {
            modelAndView.setViewName("redirect:/error");
        } else {
            modelAndView.addObject("intro", intro);
            modelAndView.setViewName("introDetails");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    void save(@RequestBody Intro intro) {
        System.out.println(intro);
    }

}
