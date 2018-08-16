package co.grandcircus.Lab21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Lab21Controller {

	@RequestMapping("/")
	public ModelAndView showLab21Controller() {
		ModelAndView mav = new ModelAndView("index");
		
		
		return mav;
	}
	
	@RequestMapping("/user-registration")
	public ModelAndView showregistration() {
		ModelAndView mav = new ModelAndView("registration");
		
		return mav;
	}
	
	@RequestMapping("/summary-page")
	public ModelAndView showResults(
			@RequestParam ("firstname") String firstname, 
			@RequestParam ("lastname") String lastname,
			@RequestParam ("email") String email, 
			@RequestParam ("phonenumber") String phonenumber,
			@RequestParam ("password") String password
			) { ModelAndView mav = new ModelAndView("summary");
		mav.addObject("firstname", firstname);
		mav.addObject("lastname", lastname);
		mav.addObject("email", email);
		mav.addObject("phonenumber", phonenumber);
		mav.addObject("password", password);
		return mav;
	}
}
