package com.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author etaskin
 */

@RequestMapping("")
@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public  String printHello(ModelMap modelMap){
        modelMap.addAttribute("message", "sdf sdfsd fsd fsd f");
        return  "start";
    }

}
