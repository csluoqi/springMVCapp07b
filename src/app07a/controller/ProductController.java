package app07a.controller;

import javax.validation.Valid;




import org.apache.log4j.Logger;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import app07a.domain.Product;

@Controller
public class ProductController
{
  //private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(ProductController.class);
    private static Logger log = Logger.getLogger(ProductController.class);
    @RequestMapping(value = "/product_input")
    public String inputProduct(Model model) {
        log.info("test log4j");
        model.addAttribute("product", new Product());
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save")
    public String saveProduct(@Valid Product product,
           Errors bindingResult, Model model) {
        //如果有错，则返回原输入的表单，并提示错误信息
        if(bindingResult.getErrorCount() > 0)
        {
            System.out.println("出错了");
            for(FieldError  error : bindingResult.getFieldErrors())
            {
                System.out.println(error.getField() +" : "+error.getDefaultMessage());
            }
            return "ProductForm";
        }
        model.addAttribute("product", product);
        return "ProductDetails";
    }
}
