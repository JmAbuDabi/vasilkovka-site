package controllers;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dtos.ThemeDto;

import pack.DAO.ThemeDAO;




@Controller
public class ChooseThemeController
{
	@Autowired
	ThemeDAO themeDao;
	

	
	@RequestMapping(value="/chooseTheme",method = RequestMethod.GET)
	public ModelAndView simpleModel()
	{

	List<ThemeDto> list = themeDao.getAllThemes();
	ModelAndView mav = new ModelAndView();
	
	mav.setViewName("chooseTheme");
	mav.addObject("a", list);
	return mav;

	}
	public ThemeDAO getThemeDao() {
		return themeDao;
	}

	public void setThemeDao(ThemeDAO themeDao) {
		this.themeDao = themeDao;
	}

}
