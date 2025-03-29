package lk.ac.vau.fas.ict.first.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
@RequestMapping("/app")
public class AppController {
    @GetMapping("/msg")
    public String myMessage() {
        return "Hello SpringBoot";
    }

    @GetMapping("/name")
    public String myName() {
        return "My name is SpringBoot";
    }

    @GetMapping("/age/{ag}")
    public String myAge(@PathVariable("ag") int age) {
        return "My age is "+age;
    }
    
    @GetMapping("/course/{uni}/{crs}")
	public String MyUni(@PathVariable("uni") String university, @PathVariable("crs") String course) {
		return "My university is "+ university + " and my course is "+ course;
	}
    
    
}
