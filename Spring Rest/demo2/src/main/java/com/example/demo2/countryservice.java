package com.example.demo2;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class countryservice {

    private List<country> countries = Arrays.asList(new country("Andhrapradesh", "ongole", "india", "523001"),
            new country("califonia", "losangels", "America", "33266"));

    public List<country> getallcountries() {
        return countries;
    }

    public country getcountry(String Zipcode)
    { 
 
    return countries.stream().filter(t->t.getZipcode().equalsIgnoreCase(Zipcode)).findFirst().get();
 
    }
    
}
