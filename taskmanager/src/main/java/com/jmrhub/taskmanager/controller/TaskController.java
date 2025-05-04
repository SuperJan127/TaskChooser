package com.jmrhub.taskmanager.controller;

import com.jmrhub.taskmanager.model.Task;
import com.jmrhub.taskmanager.repository.TaskRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    // GET /api/tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // POST /api/tasks
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Task createTask(@Valid @RequestBody Task task) {
        return taskRepository.save(task);
    }

    @PutMapping("{id}")
    public Task updateTask(@Valid @PathVariable Long id, @RequestBody Task updatedTask){
       Task task = taskRepository.findById(id).
               orElseThrow(() -> new RuntimeException("Task not Found"));

       task.setTitle(updatedTask.getTitle());
       task.setCompleted(updatedTask.isCompleted());

       return taskRepository.save(task);

    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void deleteTask(@PathVariable Long id){
        if(!taskRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        taskRepository.deleteById(id);

    }
}
