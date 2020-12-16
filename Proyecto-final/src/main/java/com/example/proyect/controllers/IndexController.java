package com.example.proyect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"/home","/"})
	public String index() {
			 
		return "index";
	}
	
	@GetMapping({"/acceder","/iniciar"})
	public String acceder() {
		return "acceder";
	}
	@GetMapping({"/Juegos","/comprar"})
	public String comprar() {
		return "comprar";
	}
	@GetMapping({"/usuario-nuevo","/registro"})
	public String registro() {
		return "registro";
	}
	@GetMapping({"/biblio","/pero"})
	public String biblioteca() {
		return "biblioteca";
	}
	@GetMapping({"/publi"})
	public String publicar() {
		return "publicar";
	}
}
