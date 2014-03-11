package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController
{
	
	@RequestMapping(value="/loginPage",method = RequestMethod.GET)
	public ModelAndView simpleModel()
	{
	ModelAndView mav = new ModelAndView();
	mav.setViewName("loginPage");
	return mav;
	}

    @RequestMapping(value="/loginfailed", method = RequestMethod.GET)
    public String loginerror(ModelMap model) {


        return "loginFailed";

    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logout(ModelMap model) {

        return "login";

    }

}
