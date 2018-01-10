package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.dizaer.site.service.BannerService;

@Controller
@RequestMapping("/banner")
public class BannerController {
    @Autowired
    BannerService bannerService;

    @RequestMapping(method = RequestMethod.GET)
    ModelAndView showList(ModelAndView modelAndView) {
        modelAndView.addObject("banners", bannerService.findAll());
        modelAndView.setViewName("bannerList");
        return modelAndView;
    }
}
