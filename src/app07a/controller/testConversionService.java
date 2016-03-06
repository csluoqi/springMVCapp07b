package app07a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app07a.domain.Product;

@Controller
public class testConversionService
{
    @RequestMapping(value="/testConversionServiceConverter")    
    public String test(@RequestParam("product") Product product )
    {
        System.out.println("/testConversionServiceConverter"+product);
        return "ProductForm";
    }
}









