package org.smartcompras.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SistemaController {
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}

	
	@RequestMapping("equipe")
	public String equipe() {
		return "equipe";
	}

	@RequestMapping("sobre")
	public String sobre() {
		return "sobre";
	}

	@RequestMapping("uso")
	public String uso() {
		return "uso";
	}
	
	@RequestMapping("sistema")
	public String sistema() {
		return "sistema";
	}
	
	@RequestMapping("produto")
	public String produto() {
		return "produto";
	}
	
	@RequestMapping("marca")
	public String marca() {
		return "marca";
	}
	

}
