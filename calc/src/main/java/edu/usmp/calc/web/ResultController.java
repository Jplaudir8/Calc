package edu.usmp.calc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.usmp.calc.model.Result;

@Controller
public class ResultController {
	@GetMapping("/calcInt")
	public String initCreationForm(Model model) {
		model.addAttribute("result", new Result());
		
		return "calcForm";
	}
	
	@PostMapping("/calcInt")
	public String submitForm(@ModelAttribute Result result) {
		return "resultForm";
	}
	
}
