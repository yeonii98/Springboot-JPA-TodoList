package com.ajy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ajy.todo.test.Todo;

@RestController
public class TodoApiController {
	
	@Autowired
	private TodoService todoService;
	
	@PostMapping("/api/todo")
	public ResponseDto<Integer> save(@RequestBody Todo todo) {
		todoService.추가하기(todo);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); 
	}

	@DeleteMapping("/api/todo/{id}")
	public ResponseDto<Integer> deleteById(@PathVariable int id){
		todoService.삭제하기(id);
		return new ResponseDto<Integer>(HttpStatus.OK.value(), 1); 
	}
	
}
