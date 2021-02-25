package Assignment1Q6;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller {
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	public ModelAndView usecontroller() {
	ModelAndView model=new ModelAndView("login");
    return model;
	}

}
