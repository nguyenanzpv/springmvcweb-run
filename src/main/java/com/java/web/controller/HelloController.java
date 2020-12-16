package com.java.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
  @RequestMapping("/")
  public String index() {
    return "index";
  }
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String hello() {
    return "hello";
  }
  @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {

      model.addAttribute("message", "An");
      return "hello";

  }
  
  @RequestMapping(value = "/hellomodel", method = RequestMethod.GET)
  public ModelAndView helloModel() {

      ModelAndView model = new ModelAndView();
      model.setViewName("hello");
      model.addObject("msg", "ModelAndView");

      return model;

  }

}
