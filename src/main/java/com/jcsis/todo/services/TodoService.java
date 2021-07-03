package com.jcsis.todo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcsis.todo.domain.Todo;
import com.jcsis.todo.repositories.TodoRepository;

@Service
public class TodoService {
	@Autowired
	private TodoRepository repo;
	public Todo findById(Integer id) {
		Optional<Todo> obj = repo.findById(id);
		return obj.orElse(null);
//		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Todo.class.getName()));
	}
}