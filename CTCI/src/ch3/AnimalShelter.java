package ch3;

import java.util.HashMap;
import java.util.LinkedList;

public class AnimalShelter {

	private int count;
	private LinkedList<DogNode> dogList;
	
	private class DogNode{
		
		private String name;
		private int count;
		
		private DogNode(Dog dog, int count){
			this.name = dog.getName();
			this.count = count;
		}

		public String getName() {
			return name;
		}

		public int getCount() {
			return count;
		}
		
		
	}

}