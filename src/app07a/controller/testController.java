package app07a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController
{
    @RequestMapping(value="/test")
    public String test()
    {
        System.out.println("test into");
        return "test";
    }

}
