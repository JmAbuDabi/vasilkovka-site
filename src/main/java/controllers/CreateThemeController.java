package controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dtos.TestDto;
import dtos.ThemeDto;

import pack.DAO.TestDAO;
import pack.DAO.ThemeDAO;

import transportobjects.ForTheme;

@Controller
public class CreateThemeController {
	List<Integer> saveIds;
	@Autowired
	TestDAO testDao;
	@Autowired
	ThemeDAO themeDao;

	List<TestDto> a;

	@RequestMapping(value = "/createTheme", method = RequestMethod.GET)
	public ModelAndView showPage() {
		a = testDao.getAllTest();
		
		ForTheme forTheme = new ForTheme();
		ModelAndView mav = new ModelAndView();
		mav.addObject("b", a);
		mav.addObject("forTheme", forTheme);
		mav.setViewName("createTheme");
		return mav;
	}

	@RequestMapping(value = "/createTheme", method = RequestMethod.POST)
	public String addTheme(@ModelAttribute("forTheme") ForTheme forTheme,
			Model model) {
		themeDao.addTheme(forTheme.getThemeName());
		saveIds = getNujnieTests(forTheme.getTests());
		saveData(saveIds);
		return "sucess";

	}

	public List<Integer> getNujnieTests(List<String> names) {
		List<Integer> ids = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < names.size(); j++) {
				if (a.get(i).getTestName().equals(names.get(j))) {
					ids.add(a.get(i).getTestId());
				}
			}
		}
		return ids;
	}

	public void saveData(List<Integer> ids) {
		List<ThemeDto> themes = themeDao.getAllThemes();
		int idTheme = themes.get(themes.size() - 1).getIdTheme();
		for (int i = 0; i < saveIds.size(); i++) {
			testDao.addTestInTheme(saveIds.get(i), idTheme);
		}
	}
}
