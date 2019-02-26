package com.csl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

/**
 * Created by dell on 2018/8/27.
 */
@Controller
public class InitController {
    private Logger logger = Logger.getLogger(String.valueOf(InitController.class));

    @RequestMapping(value = "html/*.html", produces = "text/html; charset=utf-8")
    public ModelAndView gethtml(HttpServletRequest request) {
//        System.out.println( request.getRequestURI());
        String page=request.getRequestURI().split("/")[request.getRequestURI().split("/").length-1];
//        System.out.println(page);
        ModelAndView view = new ModelAndView(page.split(".html")[0]);
        return view;
    }
    @RequestMapping(value = "/*.html", produces = "text/html; charset=utf-8")
    public ModelAndView getjsp(HttpServletRequest request) {
        String page=request.getRequestURI().split("/")[request.getRequestURI().split("/").length-1];
        ModelAndView view = new ModelAndView(page.split(".html")[0]);
        return view;
    }
    @RequestMapping(value = "admin/*.html", produces = "text/html; charset=utf-8")
    public ModelAndView getjsp1(HttpServletRequest request) {
        System.out.println(request.getRequestURI());
        String page=request.getRequestURI().split("/")[request.getRequestURI().split("/").length-1];
        page="admin/"+page;
        ModelAndView view = new ModelAndView(page.split(".html")[0]);
        return view;
    }

}