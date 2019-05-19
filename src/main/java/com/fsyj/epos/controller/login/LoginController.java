package com.fsyj.epos.controller.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody// 所有方法的数据直接返回给浏览器*/
@RestController
public class LoginController {

//    @ResponseBody
    @RequestMapping("/test")
    String test() {
        return "this is init test.";
    }

}
