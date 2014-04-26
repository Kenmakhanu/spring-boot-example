package net.bluemix.todos.controllers;

import java.util.List;

import net.bluemix.todos.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
public class ToDoController {
  
  @Autowired
  private ToDoRepo repo;
  
  @RequestMapping(value="{id}", method=RequestMethod.DELETE)
  void delete(@PathVariable String id) {
    repo.delete(id);
  }
  
  @RequestMapping(method=RequestMethod.POST)
  ToDo create(@RequestBody ToDo domain) {
    return repo.save(domain);
  }
  
  @RequestMapping(value="{id}", method=RequestMethod.PUT)
  ToDo update(@RequestBody ToDo domain, @PathVariable String id) {
    ToDo td = repo.findOne(id);
    td.setCompleted(domain.isCompleted());
    td.setOrder(domain.getOrder());
    td.setTitle(domain.getTitle());
    return repo.save(domain);
  }
  
  @RequestMapping(method=RequestMethod.GET)
  List<ToDo> list() {
    return repo.findAll();
  }
}