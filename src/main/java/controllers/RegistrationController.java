package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController
{
	
	@RequestMapping(value="/registrationPage",method = RequestMethod.GET)
	public ModelAndView simpleModel()
	{
	ModelAndView mav = new ModelAndView();
	mav.setViewName("registrationPage");
	return mav;
	}


}
