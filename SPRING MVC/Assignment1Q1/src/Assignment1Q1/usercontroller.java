package Assignment1Q1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class usercontroller {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView usecontroller() {
	ModelAndView model=new ModelAndView("login");
    return model;
	}
	
	@RequestMapping(value="/success",method=RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("use") User use)
	{
		
		if(use.getUsername().equals("venkat")&&use.getPassword().equals("venkat123"))
		{
			return new ModelAndView("success");
		}
		//model.addObject("success",use.getUsername());
		//return new ModelAndView("error");
		return new ModelAndView("error");
	}
	
}


