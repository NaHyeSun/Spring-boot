package com.ohgiraffers.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionHandlerController {

    @GetMapping("controller-null")
    public String nullPointerExceptionTest(){

        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }
}
