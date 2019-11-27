package app.front.client.controller;

import java.util.*;

import app.front.client.form.*;
import app.front.client.model.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;

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
    public String index(Model model){
        RestTemplate rt = new RestTemplate();
        url = carBase + "car";
        List<Car> cars = rt.getForObject(url, List.class);
        model.addAttribute("cars", cars);
        return "index";
    }

    // to test render view
    @GetMapping(value = {"/userInfo" })
    public String userInfo(Model model) {
        return "userForm";
    }

    @PostMapping(value = {"/userInfo" })
    public String userInfo(Model model, @ModelAttribute("resaForm") ResaForm resaForm) {
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();



        return "userForm";
    }

}
