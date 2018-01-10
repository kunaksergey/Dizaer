package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.dizaer.site.service.PortfolioService;

@Controller
@RequestMapping("/header")
public class PortfolioController {
    @Autowired
    PortfolioService portfolioService;
}
