package com.practice;

public class Object_withOut_new_Keyword {

	public static void main(String[] args) {
		YourClass.INSTANCE.setName("Example"); // No 'new' keyword
		System.out.println("Object created: " + YourClass.INSTANCE);

	}

}

enum YourClass {
	INSTANCE;

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

/*
 * Explanation Enum Singleton: Enums can only have a single instance, which is
 * accessed via YourClass.INSTANCE. Setting Properties: You can set properties
 * or invoke methods on this instance without using new anywhere.
 */


/*
 * enum singleton
 * 
 * enum Direction { NORTH, SOUTH, EAST, WEST; }
 * 
 * Each of NORTH, SOUTH, EAST, and WEST is a unique instance of the Direction
 * enum.
 * 
 * Key Points: Singleton Nature: Each constant in an enum is effectively a
 * singleton. For example, Direction.NORTH always refers to the same instance.
 * Fixed Set: You cannot create new instances of an enum at runtime; the set of
 * instances is defined at compile time.
 */