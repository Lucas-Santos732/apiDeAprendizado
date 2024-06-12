package com.lucassouza.api.repositories;

import com.lucassouza.api.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task>

}
