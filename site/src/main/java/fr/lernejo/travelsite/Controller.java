package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {
    final ArrayList<UserRegister> register = new ArrayList<>();

    @PostMapping("/api/inscription")
    public ArrayList<UserRegister> register(@RequestBody UserRegister register) {
        this.register.add(register);
        return this.register;
    }

    @GetMapping("/api/travels")
    public ArrayList<CountryDestination> getCountry(@RequestParam String userName) {
        ArrayList<CountryDestination> countries = new ArrayList<>();
        countries.add(new CountryDestination("Israel", 28.4));
        countries.add(new CountryDestination("Sweden", 12.5));

        for(UserRegister register : this.register){
            if(register.userName().equals(userName)){
                return countries;
            }
        }
        return new ArrayList<>();
    }
}
