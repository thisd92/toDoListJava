package br.com.devth.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devth.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
