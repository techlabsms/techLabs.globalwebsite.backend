package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import entities.Entry;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {

		Entry entry = new Entry("Hallo", "omg es funktioniert");
		return entry.toHTML();
	}

}
