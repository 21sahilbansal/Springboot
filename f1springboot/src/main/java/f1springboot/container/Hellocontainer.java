package f1springboot.container;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontainer {
  
	@RequestMapping("/Hello")
	public String sayhi() {
		return "Hi hdgscu";
	}
}
