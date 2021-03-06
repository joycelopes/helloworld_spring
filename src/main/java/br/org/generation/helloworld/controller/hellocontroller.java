package br.org.generation.helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	
	@RestController
	@RequestMapping("/objetivos")
	public class HelloObjetivosController {
	    
	    @GetMapping
		public String objetivos() {
			return "<b>Objetivo de aprendizagem da semana:</b>"
					+ "<br /> "
					+ "<br /> Aprender a fazer um CRUD no Spring!";
		}
	}

	@RestController
	@RequestMapping("/bsm")
	public class HelloBsmController {
	    
	    @GetMapping
		public String habilidades() {
			
	        return  "<b>Mentalidades</b>"
	                + "<br /> "
	                + "<br /> Orientação ao futuro"
					+ "<br /> Responsabilidade pessoal"
	                + "<br /> Mentalidade de crescimento"
	                + "<br /> Persistência"
	                + "<br /> "
	                + "<br /> <b>Habilidades</b>"
	                + "<br /> "
	                + "<br /> Trabalho em equipe"
	                + "<br /> Atenção aos detalhes"
	                + "<br /> Proatividade"
					+ "<br /> Comunicação";
	    }
	    
	}
}
