package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.PersonaInterface;
import com.example.demo.model.Persona;
import com.example.demo.modelDAO.PersonaDAO;

@Service
public class PersonaService implements PersonaInterface {
	@Autowired
	PersonaDAO dao;

	@Override
	public List<Map<String, Object>> listar() {		
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Persona p) {
		return dao.add(p);
	}

	@Override
	public int edit(Persona p) {
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		return dao.delete(id);
	}

}
