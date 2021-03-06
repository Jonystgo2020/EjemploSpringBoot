package com.talento.springdemo.EjemploSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.talento.springdemo.EjemploSpringBoot.dao.PersonaDAO;
import com.talento.springdemo.EjemploSpringBoot.service.PersonaService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class InicioController {
	
	@Autowired
	private PersonaService servicio;
	
	@GetMapping("/")
	public String inicio(Model model) {
	
		var personas = servicio.listarPersonas();
		
		
		//var personas=new ArrayList();
		//var personas=Array.asList(persona1,persona2,persona3);
		model.addAttribute("personas",personas);
		return "index";
	}
}
