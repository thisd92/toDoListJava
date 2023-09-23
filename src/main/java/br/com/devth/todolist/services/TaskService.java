package br.com.devth.todolist.services;

import br.com.devth.todolist.model.Task;
import br.com.devth.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Transactional()
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }

    @Transactional(readOnly = true)
    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Task> findById(Long id){
        return taskRepository.findById(id);
    }

    public Task updateTask(Long id, Task task) {
        Task entity = taskRepository.findById(id).orElseThrow();
        updateData(entity, task);
        return taskRepository.save(entity);
    }

    public void updateData(Task entity,  Task task) {
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
    }
	

}
