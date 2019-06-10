package com.fsyj.epos.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*@Controller
@ResponseBody// 所有方法的数据直接返回给浏览器*/
@Controller
public class LoginController {

//    @ResponseBody
@RequestMapping("/")
public String index() {
    System.out.println("进入登陆页面！");
    return "登录.html";
    }

    @PostMapping("login")
    public ModelAndView login(@RequestParam("loginName") String loginName, @RequestParam("password") String password, ModelAndView modelAndView) {
        System.out.println("登陆用户：" + loginName + "  验证码：" + password);
        modelAndView.setViewName("redirect:/main");
        return modelAndView;
    }

    @RequestMapping("main")
    String firstPage() {
        System.out.println("跳转进入到主页");
        return "堕落小龙虾(海鲜·香宁巷店)外卖_堕落小龙虾(海鲜·香宁巷店)菜单_电话_堕落小龙虾(海鲜·香宁巷店)网上订餐 - 遵义市汇川区香港路香宁巷金城公寓3号.html";
    }

}
