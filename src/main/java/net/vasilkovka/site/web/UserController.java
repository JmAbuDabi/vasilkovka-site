package net.vasilkovka.site.web;

import java.util.Map;

import net.vasilkovka.site.domain.User;
import net.vasilkovka.site.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String listContacts(Map<String, Object> map) {

		map.put("contact", new User());
		map.put("contactList", userService.listContact());

		return "contact";
	}
	

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact") User user,
			BindingResult result) {

        userService.addContact(user);

		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Integer contactId) {

        userService.removeContact(contactId);

		return "redirect:/index";
	}
}
