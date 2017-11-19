package com.property.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController{
    @RequestMapping(method = RequestMethod.GET, value = "/qia/api/bookmark")
    @ResponseBody
    public List getTable(@RequestParam("userId") String userId,
                             HttpServletResponse response){
        return null;
    }
}