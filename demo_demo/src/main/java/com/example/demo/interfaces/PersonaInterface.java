package com.example.demo.interfaces;

import java.util.List;
import java.util.Map;

import com.example.demo.model.Persona;

public interface PersonaInterface {
	public List<Map<String, Object>> listar();
	public List<Map<String, Object>> listar(int id);
	public int add(Persona p);
	public int edit(Persona p);
	public int delete(int id);
}
