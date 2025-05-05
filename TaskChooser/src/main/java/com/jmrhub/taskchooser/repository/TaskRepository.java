package com.jmrhub.taskchooser.repository;

import com.jmrhub.taskchooser.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
