package net.bluemix.todos.controllers;

import net.bluemix.todos.ToDo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepo extends MongoRepository<ToDo, String> {
  //You may add other methods here to create queries to execute on the repository
}