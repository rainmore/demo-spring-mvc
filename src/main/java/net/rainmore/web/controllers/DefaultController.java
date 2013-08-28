package net.rainmore.web.controllers;

import net.rainmore.web.utils.ViewHelpers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DefaultController extends GenericController {

    protected static String defaultViewPath = "default";

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return ViewHelpers.buildViewPath("hello", defaultViewPath);
    }

    @RequestMapping(value = "/error/404", method = RequestMethod.GET)
    public String error404 () {
        return ViewHelpers.buildViewPath("404", defaultViewPath);
    }

    @RequestMapping(value = "/error/500", method = RequestMethod.GET)
    public String error500 () {
        return ViewHelpers.buildViewPath("500", defaultViewPath);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return ViewHelpers.buildViewPath("login", defaultViewPath);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout() {
        return ViewHelpers.buildViewPath("logout", defaultViewPath);
    }
}
