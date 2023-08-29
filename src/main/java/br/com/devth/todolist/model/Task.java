package br.com.devth.todolist.model;

public class Task {
	
	Long id;
	String tittle, description;
	Boolean completed;
	
	public Task() {
		
	}
	
	public Task(Long id, String tittle, String description, Boolean completed) {
		super();
		this.id = id;
		this.tittle = tittle;
		this.description = description;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
}
