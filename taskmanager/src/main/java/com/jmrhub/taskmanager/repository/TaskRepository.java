package com.jmrhub.taskmanager.repository;

import com.jmrhub.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
