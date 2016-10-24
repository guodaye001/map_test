package com.map.platform.interfaces.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/locus")
public class LocusController {
      
    @RequestMapping("/index")
    public String toIndex(HttpServletRequest request){  
        System.out.println("----------------");
        return "system.user";  
    }
    
    @RequestMapping("/add")
    public String toAdd(HttpServletRequest request){  
        System.out.println("----------------");
        return "system.add";  
    }
}
