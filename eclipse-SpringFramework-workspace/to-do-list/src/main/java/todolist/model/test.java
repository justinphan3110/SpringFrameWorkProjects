package todolist.model;

import java.lang.reflect.Method;

public class test {
	public static void main(String[] args) {
	String a = "hello";
	
	System.out.println("a");
	Method[] classArray = a.getClass().getDeclaredMethods();
	for(Method m: classArray)
		System.out.println(m.getName());
	}
}
