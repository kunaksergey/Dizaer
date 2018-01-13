package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.dizaer.site.service.IntroService;


@Controller
@RequestMapping("/")
public class WelcomeController {
    @Autowired
    private IntroService introService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView welcome(ModelAndView modelAndView) {
        modelAndView.addObject("introRandom", introService.randomIntro());
        modelAndView.addObject("intros", introService.randomRangeListIntro());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    String error() {
        return "error";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    String menu() {
        return "/menu_second";
    }
}
