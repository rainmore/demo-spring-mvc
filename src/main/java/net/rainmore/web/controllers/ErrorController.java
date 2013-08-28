package net.rainmore.web.controllers;

import net.rainmore.web.utils.ViewHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ErrorController extends GenericController {

    @RequestMapping(value = "/error/404", method = RequestMethod.GET)
    public String error404 () {
        return ViewHelpers.buildViewPath("/error/404");
    }

    @RequestMapping(value = "/error/500", method = RequestMethod.GET)
    public String error500 () {
        return ViewHelpers.buildViewPath("/error/500");
    }
}
