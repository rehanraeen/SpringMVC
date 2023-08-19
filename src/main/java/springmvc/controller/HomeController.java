package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("home controller");
		model.addAttribute("name","rehan raeen");
		
		List<String> friend =new ArrayList<String>();
		friend.add("ammar");
		friend.add("abdul");
		friend.add("shabbir");
		
		model.addAttribute("f",friend);
		
		return "index";
	}
	
	@RequestMapping("/name")
	public String name() {
		System.out.println("name");
		return "Rehan";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
	      ModelAndView modelAndView = new ModelAndView();
	      
	      modelAndView.addObject("name","rehan raeeen");
	      modelAndView.addObject("id",26);
	      LocalDateTime now = LocalDateTime.now();
	      modelAndView.addObject("date", now);
	      
	      modelAndView.setViewName("help");
	      return modelAndView;
	}
}
