package Assignmentt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class usercontroll {
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public ModelAndView usecontroller() {
	ModelAndView model=new ModelAndView("employee");
    return model;
	}
	
	@RequestMapping(value="/details",method=RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("use") Employee use)
	{
		return new ModelAndView("details");
	}

	

	
	

}
