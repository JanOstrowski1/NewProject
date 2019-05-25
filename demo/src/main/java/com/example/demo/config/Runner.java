//package com.example.demo.config;
//
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//public class Runner {
//
//    @RequestMapping(value = "/cars", method = RequestMethod.GET)
//    public String init(@ModelAttribute("model") ModelMap model) {
//        model.addAttribute("carList","HelloWorld");
//        return "index";
//    }
//}
