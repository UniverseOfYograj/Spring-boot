package com.example.taskmanager.repositery;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.taskmanager.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
