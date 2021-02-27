package com.ajy.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajy.todo.test.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
