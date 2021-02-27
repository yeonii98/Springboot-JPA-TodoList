package com.ajy.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ajy.todo.test.Todo;

@Controller
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	//http://localhost:8080/todolist
	@GetMapping("/todolist")
	public String todo(Model model, @PageableDefault(sort="id", direction = Direction.DESC)Pageable pageable, Todo todo) {
		model.addAttribute("todolist", todoService.todo목록(pageable));
		return "todo";
	}
}
