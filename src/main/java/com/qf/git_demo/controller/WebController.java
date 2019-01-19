package com.qf.git_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhushouzheng
 * @Date 2019/1/19
 */
@Controller
@RequestMapping("web")
public class WebController {

    @RequestMapping("gotoInit")
    public String gotoInit(){
        System.out.println("第一次提交");
        return null;
    }
}
