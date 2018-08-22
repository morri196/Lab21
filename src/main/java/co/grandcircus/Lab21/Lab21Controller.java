package co.grandcircus.Lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Lab21.dao.ItemsDao;
import co.grandcircus.Lab21.dao.UsersDao;
import co.grandcircus.Lab21.entity.Users;

@Controller
public class Lab21Controller {
	
	@Autowired
	ItemsDao itemsDao;
	@Autowired
	UsersDao usersDao;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		
		//List<Items> listOfItems = itemsDao.findAll();
		mav.addObject("items", itemsDao.findAll());
		return mav;
	}
	
	@RequestMapping("/user-registration")
	public ModelAndView showregistration(	) {
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
			) {
			Users user = new Users();
			user.setFirstname(firstname);
			user.setLastname(lastname);
			user.setEmail(email);
			user.setPhonenumber(phonenumber);
			user.setPassword(password);
			ModelAndView mav = new ModelAndView("summary");	
			usersDao.create(user);
			return mav;
	}
	
}
