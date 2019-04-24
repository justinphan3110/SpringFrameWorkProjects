package todolist.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
public class TodoItem {
	// == fields
	private int id;
	private String title;
	private String details;
	private LocalDate deadline;
	
	// == Constructors 
	public TodoItem(String title, String details, LocalDate deadline) {
		super();
		this.title = title;
		this.details = details;
		this.deadline = deadline;
	}
	
	
	
	
	
}	
