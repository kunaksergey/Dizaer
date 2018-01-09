package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.dizaer.site.model.entity.Intro;
import ua.dizaer.site.service.IntroService;

@Controller
@RequestMapping("/intro")
public class IntroController {

  @Autowired
  private IntroService introService;

  @RequestMapping(value = "/{name}",method = RequestMethod.GET)
  ModelAndView  show(@PathVariable String name, ModelAndView modelAndView){
      Intro intro=introService.findOne(name);
      modelAndView.addObject("intro",intro);
      modelAndView.setViewName("introDetails");
      return modelAndView;
  }
}