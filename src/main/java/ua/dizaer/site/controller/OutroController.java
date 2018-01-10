package ua.dizaer.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.dizaer.site.service.OutroService;

/**
 * Created by sa on 10.01.18
 *
 */
@Controller
@RequestMapping("/outro")
public class OutroController {
    @Autowired
    OutroService outroService;
}

