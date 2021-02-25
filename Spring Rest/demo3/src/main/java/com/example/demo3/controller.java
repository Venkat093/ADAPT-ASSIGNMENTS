package com.example.demo3;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller{

 private service employeeservice;
@RequestMapping("/employees")
public List<Employee> allemployess()
{
    return employeeservice.getallemployes();
}

}