package relations;

import java.util.*;

class Room {
	String type;
	
	Room(String type) {
		this.type = type;
	}
}

class House {
	String name;
    List<Room> rooms;
    
    House(String name, List<Room> rooms) {
    	this.name = name;
    	this.rooms = rooms;
    }
    
    void addRoom(Room room) {
    	rooms.add(room);
    }
    
    void display() {
    	for (Room room: this.rooms) {
    		System.out.print(room.type+ " ");
    	}
    	
    	System.out.println("are part of " +this.name);
    }
}

public class CompositionTest {  
	public static void main(String[] args) {
		Room livingRoom = new Room("LivingRoom");
		Room kitchenroom = new Room("kitchenRoom");
		
		House house = new House("House", new ArrayList<>());
		
		house.addRoom(livingRoom);
		house.addRoom(kitchenroom);
		
		house.display();
	}
}