package org.redhat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: huangtao
 * Date: 2018/6/1
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Controller
@RequestMapping("/test")
public class helloController {
    @RequestMapping("/hello")
    public String welcome(){
        return "helloWorld";
    }

}