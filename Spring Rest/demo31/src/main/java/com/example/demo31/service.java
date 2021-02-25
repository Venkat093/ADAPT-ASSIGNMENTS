package com.example.demo31;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service
{
  //  @Autowired
   // private employeerepositry Employeerepositry;

 /*   public List<Employee> employees = new ArrayList<>(Arrays.asList(
         new Employee("01","vnky","it","softwaredevelopper","30000"),
         new Employee("02","vnky093","5g","embedded","34000")
   )); */
   private List<Employee> employes = new ArrayList<>();
   public void gett()
   {
    
   employes.add(new Employee("01","vnky","it","softwaredevelopper","30000"));
   employes.add( new Employee("02","vnky093","5g","embedded","34000"));
   }  

    public List<Employee> getallemployes()
    {
        /* List<Employee> employees =new ArrayList<>();
         Employeerepositry.findAll()
         .forEach(employees::add);
         return employees; */
        gett();
         return employes;
    }

}