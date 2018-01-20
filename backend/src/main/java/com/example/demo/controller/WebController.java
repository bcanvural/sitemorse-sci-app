package com.example.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version "\$Id$" kenan
 */
@Controller
@RequestMapping
public class WebController {


    @GetMapping("/")
    @Transactional(readOnly = true)
    public ModelAndView home(HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("index.html");
        return modelAndView;
    }

}
