package com.example.demo11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class countryservice {
   // @Autowired
 //   private countryrepositry repostry;
 
    private List<country> countries = new ArrayList<>(Arrays.asList(new country("Andhrapradesh", "ongole", "india", "523001"),
            new country("califonia", "losangels", "America", "33266")));

    public List<country> getallcountries() {
        return countries;
       // List<country> countries=new ArrayList<>();
        //repostry.findAll()
        //.forEach(countries::add);
        //return countries;

    }

    public country getcountry(String Zipcode)
    { 
 
    return countries.stream().filter(t->t.getZipcode().equalsIgnoreCase(Zipcode)).findFirst().get();
 
    }
	public void addcountry( country Country) {
        countries.add(Country);
	}

	public void updadtecountry(String Zipcode, country country) {
        for(int i=0;i<countries.size();i++)
        {
            country c=countries.get(i);
            if(c.getZipcode().equals(Zipcode))
            {
                countries.set(i, country);
                return;
            }
        }
	}

	public void deletetecountry(String Zipcode) {
        countries.removeIf(t->t.getZipcode().equals(Zipcode));
	}
    
}
