package com.fsyj.epos.controller.login;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class LoginController {

    @RequestMapping("/test")
    @ResponseBody
    String test() {
        return "this is init test.";
    }

}
