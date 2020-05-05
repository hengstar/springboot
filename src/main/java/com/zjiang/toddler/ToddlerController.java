package com.zjiang.toddler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description: ToddlerController <br>
 * date: 2020/4/17 21:46 <br>
 * author: Administrator <br>
 * version: 1.0 <br>
 */
@RestController
public class ToddlerController {
    @Autowired
    IToddler toddler;

    @RequestMapping( value = "/gettoddler", method = RequestMethod.POST)
    public  Toddler getToddler(){
        return toddler.getToddler();
    }

    public boolean equals(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception {
        String method=request.getMethod();
        if(!method.equalsIgnoreCase("GET")&&!method.equalsIgnoreCase("POST")){
            return true;
        }
        return false;
    }
}
