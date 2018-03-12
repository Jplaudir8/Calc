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
		
		switch(result.getOp()) {
		case 'a':
			result.setResult(result.getN1()+result.getN2());
			break;
		case 's':
			result.setResult(result.getN1()-result.getN2());
			break;
		case 'm':
			result.setResult(result.getN1()*result.getN2());
			break;
		case 'd':
			result.setResult(result.getN1()/result.getN2());
			break;
		default:
			result.setResult(0);
			break;
		}
		
		return "resultForm";
	}
	
}
