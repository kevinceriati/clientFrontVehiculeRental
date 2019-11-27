package app.front.client.controller;

import app.front.client.model.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class MainController {

    @Value("${api.client}")
    private String userBase;

    @Value("${api.cars}")
    private String carBase;

    @Value("${api.reservation}")
    private String reserveBase;
    private String url;

    @GetMapping(value = { "/", "/index" })
    public String index(Model model){
        RestTemplate rt = new RestTemplate();
        url = carBase + "car";
        List<Car> cars = rt.getForObject(url, List.class);
        model.addAttribute("cars", cars);
        return "index";
    }

    @GetMapping(value = {"/userInfo" })
    public String userInfo(Model model) {

        return "userForm";
    }

}
