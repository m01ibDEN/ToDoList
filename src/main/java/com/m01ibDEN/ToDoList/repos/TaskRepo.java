package com.m01ibDEN.ToDoList.repos;

import com.m01ibDEN.ToDoList.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepo extends CrudRepository<Task, Integer> {
    List<Task> findByName(String name);
    void deleteById(Integer id);
}
