package com.ajy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ajy.todo.test.Todo;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Transactional
	public void 추가하기(Todo todo) { 
		todoRepository.save(todo);
	}
	
	@Transactional
	public Page<Todo> todo목록(Pageable pageable){
		return todoRepository.findAll(pageable);
	}
	
	@Transactional
	public void 삭제하기(int id) {
		todoRepository.deleteById(id);
	}
}
