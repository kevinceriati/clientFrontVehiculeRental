package app.front.client.controller;

import java.util.*;

import app.front.client.form.*;
import app.front.client.model.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @Value("${api.client}")
    private String userBase;

    @Value("${api.cars}")
    private String carBase;

    @Value("${api.reservation}")
    private String reserveBase;

    private String url;

    private Reservation resa;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model) {
        RestTemplate rt = new RestTemplate();
        url = carBase + "car";
        List<Car> cars = rt.getForObject(url, List.class);
        model.addAttribute("cars", cars);
        return "index";
    }

//     // to test render view userInfo
//     @GetMapping(value = {"/userInfo" })
//     public String userInfo(Model model) {
//     return "userForm";
//     }

     // to test render view validation
     @GetMapping(value = { "/validation" })
     public String validation(Model model) {

     return "validationForm";
     }

    @PostMapping(value = { "userInfo" })
    public String passForm1(Model model, @ModelAttribute CarDateForm carDateForm){
        resa = new Reservation();
        resa.setCar(carDateForm.getCar());
        resa.setBeginDate(carDateForm.getBeginDate());
        resa.setEndDate(carDateForm.getEndDate());
        model.addAttribute("resa", resa);
        System.out.println(resa);
        return "userForm";
    }

    @PostMapping(value = { "validInfo" })
    public String passForm2(Model model, @ModelAttribute UserForm userForm){

        System.out.println(userForm);
        return "index";
    }
}
