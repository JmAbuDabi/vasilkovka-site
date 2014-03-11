package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AboutUsController
{

	@RequestMapping(value = "/aboutUs", method = RequestMethod.GET)
	public ModelAndView simpleModel()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("aboutUs");
		return mav;
	}
}
