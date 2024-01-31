package com.m01ibDEN.ToDoList;

import com.m01ibDEN.ToDoList.domain.Task;
import com.m01ibDEN.ToDoList.repos.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TaskController {
    @Autowired
    private TaskRepo taskRepo;

    @GetMapping("/")
    public String main(Map<String, Object> model) {
        Iterable<Task> tasks = taskRepo.findAll();

        model.put("tasks", tasks);

        return "main";
    }

    @PostMapping
    public String add(@RequestParam("name") String name, @RequestParam("text") String text, Map<String, Object> model) {
        Task task = new Task(name, text);

        taskRepo.save(task);

        Iterable<Task> tasks = taskRepo.findAll();

        model.put("tasks", tasks);

        return "main";
    }
}
