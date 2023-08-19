package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.bean.User;
import springmvc.dao.UserDao;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@RequestMapping("/d")
	public String showForm() {
		return "contact";
	}
	
	@PostMapping("/processform")
	public String processform(@ModelAttribute User user, Model model) {

		System.out.println(user);
		int crateUser = this.userService.crateUser(user);
		return "sucess";
	}

	/*
	 * @PostMapping("/processform") public String processform(@RequestParam("email")
	 * String email,
	 * 
	 * @RequestParam("userName") String userName, @RequestParam("password") String
	 * password, Model model) {
	 * 
	 * model.addAttribute("email", email); model.addAttribute("userName", userName);
	 * model.addAttribute("password", password);
	 * 
	 * return "sucess"; }
	 */

}
