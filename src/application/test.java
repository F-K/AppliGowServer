package application;

import java.util.ArrayList;
import java.util.List;

import model.event.Event;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Event> events = new ArrayList<Event>();
		Event e1 = new Event();
		e1.setId(1);
		e1.setTitle("My Title 1");

		Event e2 = new Event();
		e2.setId(2);
		e2.setTitle("My Title 2");

		Event e3 = new Event();
		e3.setId(3);
		e3.setTitle("My Title 3");
		
		events.add(e1);
		events.add(e2);
		events.add(e3);
		
		display(events);
		
		Event e4 = new Event();
		e4.setId(2);
		e4.setTitle("My Title 2");
		events.remove(e4);
		display(events);
	}
	
	public static void display(List<Event> events) {
		for(Event e : events) {
			System.out.println(e.getId() + "   " + e.getTitle());
		}
		System.out.println("===============");
	}

}
