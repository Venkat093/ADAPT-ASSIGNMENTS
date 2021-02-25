package com.example.demo2;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private countryservice Countryservice;

    @RequestMapping("/countryr")
    public List<country> getList()
    {
      return  Countryservice.getallcountries();
    }
    // @RequestMapping("/country/{id}")
    // public country getcountry(@PathVariable("id") int Zipcode)
    // {
    //     country c2=new country();
    //     c2.setZipcode(Zipcode);
    //     return c2;

    // }
    @RequestMapping("/country/Zipcode")
    public country getcountries(String Zipcode)
    {
        return Countryservice.getcountry("523001");
    }
   

}