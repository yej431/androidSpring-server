package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.PersonaService;

@RestController
public class PersonaController {
	@Autowired
	PersonaService service;
	
	@GetMapping("/listar")
	public List<Map<String,Object>> listar(){
		return service.listar();
	}
	@PostMapping("/agregar")
	public String save(@RequestBody Persona p) {
		int r=service.add(p);
		if(r==0) {
			return "No register";
		}else {
			return "registerd";
		}
	}
	
	@PostMapping("/actualizar/{id}")
	public String update(@RequestBody Persona p,@PathVariable int id, Model m) {
		p.setId(id);
		int r=service.edit(p);
		if(r==0) {
			return "No register";
		}else {
			return "registerd";
		}
	}
	@PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id, Model m) {
		int r=service.delete(id);
		if(r==0) {
			return "삭제 에러";
		}
		return "삭제 완료";
	}
}
