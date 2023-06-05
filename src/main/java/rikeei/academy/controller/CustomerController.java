package rikeei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import rikeei.academy.model.Customer;
import rikeei.academy.service.ICustomerService;

import java.util.List;
import java.util.Locale;

@Controller

public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    MessageSource messageSource;
    @GetMapping("/")
    public String findAll(ModelMap model, @RequestParam(value = "lang", defaultValue = "en") String lang){
        Locale locale = Locale.forLanguageTag(lang);
        String stt = messageSource.getMessage("message.stt",null,locale);
        String name = messageSource.getMessage("message.name",null,locale);
        String address = messageSource.getMessage("message.address",null,locale);
        String phone = messageSource.getMessage("message.phone",null,locale);
        List<Customer> list = customerService.findAll();
        model.put("stt",stt);
        model.put("name",name);
        model.put("address",address);
        model.put("phone",phone);
        model.put("list",list);
        return "/home";
    }
}
