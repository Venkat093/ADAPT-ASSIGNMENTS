package com.example.demo1;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class controller {
    @RequestMapping("/loginusers")
    public ArrayList<login> getList()
    {
        login l1=new login();
        l1.setUsername("venkat");
        l1.setPassword("venkat123");
        login l2 = new login();
        l2.setPassword("sai123");
        l2.setUsername("sai");
        ArrayList<login> list=new ArrayList<>();
         list.add(l1);
         list.add(l2);
         return list;
    }

    @RequestMapping("/login")
    public login user()
    {
        login l=new login();
        if(l.getUsername().equals("venkat")&&l.getPassword().equals("venkat123"))
        {
            return l;
        }
        else{
            return null;
            }
        }

}
