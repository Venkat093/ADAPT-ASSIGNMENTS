package com.example.demo11;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
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
    @RequestMapping("/country/{Zipcode}")
    public country getcountries(@PathVariable String Zipcode)
    {
        return Countryservice.getcountry(Zipcode);
    }
     
    @RequestMapping(value="/countryr" ,method=RequestMethod.POST)
    public void addCountry(@RequestBody country Country)
    {
       Countryservice.addcountry(Country);
    }
    @RequestMapping(value="/country/{Zipcode}" ,method=RequestMethod.PUT)
    public void updateCountry(@RequestBody country Country,@PathVariable String Zipcode)
    {
       Countryservice.updadtecountry(Zipcode,Country);
     }
     @RequestMapping(value="/country/{Zipcode}" ,method=RequestMethod.DELETE)
     public void deleteCountry(@PathVariable String Zipcode)
     {
        Countryservice.deletetecountry(Zipcode);
      }
   

}