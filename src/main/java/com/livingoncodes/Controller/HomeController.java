package com.livingoncodes.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sudip sarker on 2/11/2017.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(HomeController.class);
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(){
        LOGGER.debug("Rendering home page");
        return "Home";
    }
}
