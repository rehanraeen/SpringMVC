package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("first");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		
	//	return "redirect:/two";
		
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("second");
		
		return "contact";
	}

}
