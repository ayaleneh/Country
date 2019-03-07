package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    StateRepository stateRepository;
    @RequestMapping("/")
    public String index(Model model){
        Country country = new Country("Ethiopia","Addis ababa","Birr");

        State state1  = new State("Amhara");
        state1.setCountry(country);
        State state2  = new State("oromia");
        state2.setCountry(country);
        country.getState().add(state1);
        country.getState().add(state2);

        Country country1 =new Country("sudan","karthom","dollar");
        State state3=new State("abc");
        State state4=new State("def");
        state3.setCountry(country1);
        state4.setCountry(country1);
        country1.getState().add(state3);
        country1.getState().add(state4);
        countryRepository.save(country);
        countryRepository.save(country1);
        model.addAttribute("country",countryRepository.findAll());
        return "index";
    }
}
