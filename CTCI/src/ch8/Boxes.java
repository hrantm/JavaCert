package ch8;


import java.util.*;

public class Boxes {
	
	public static int createStack(ArrayList<Box> list){
		Collections.sort(list, new BoxComparator());
		System.out.println(list);
		int maxHeight = 0;
		for(int i = 0; i < list.size(); i++){
			int height = createStack(list, i);
			maxHeight = Math.max(maxHeight, height);
		}
	}

}

class Box{
	Integer h;
	Integer w;
	Integer d;
	
	public Box(int h, int w, int d){
		this.h = h;
		this.w = w;
		this.d = d;
	}
	
	public String toString(){
		return this.h.toString();
	} 
}

class BoxComparator implements Comparator<Box>{

	
	@Override
	public int compare(Box o1, Box o2) {
		// TODO Auto-generated method stub
		return -1 * o1.h.compareTo(o2.h);
	}
}