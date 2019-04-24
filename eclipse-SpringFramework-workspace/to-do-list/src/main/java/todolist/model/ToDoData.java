package todolist.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.NonNull;

public class ToDoData {
	//== fields ==
	private int currentId = 0;
	private final List<TodoItem> list = new ArrayList< >();
	
	// Constructor
	public ToDoData() {
		
		// Add temp
		this.addItem(new TodoItem("First Item", "first item details", LocalDate.now()));
		this.addItem(new TodoItem("second Item", "2nd item details", LocalDate.now()));
		this.addItem(new TodoItem("Third Item", "3re item details", LocalDate.now()));
		
	}
	
	public List<TodoItem> getItems(){
		return Collections.unmodifiableList(list);
	}
	
	public int addItem(@NonNull TodoItem item) {
		item.setId(++currentId);
		list.add(currentId, item);
		return currentId;
	}
	
	public void remove(int id) {
		list.remove(id);
	}
	
	public void updateItems(@NonNull TodoItem item) {
		list.set(getId(item), item);
	}
	
	private int getId(TodoItem item) {
		for(TodoItem i: list) {
			if(i.getTitle() == item.getTitle()) {
				return i.getId();
			}
		}
		throw null;
	}
}
