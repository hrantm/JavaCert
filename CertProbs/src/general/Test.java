package general;


import java.util.*;


import javax.lang.model.element.Element;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class A{
	static void print(){
		LocalDate ld = LocalDate.of(2015, 2, 21);
		LocalTime lt = LocalTime.of(10, 15);
		LocalDateTime dt = lt.atDate(ld);
		System.out.println(dt.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
//		System.out.println(lt.format(DateTimeFormatter.ofPattern("dd/MM/yyy")));
		System.out.println(dt);
	}
}

public class Test extends A{
	static float f = 10;
	
	public static void print(){
		System.out.println("Test");
	}
	public static void main(String[] args) {
		A a = new Test();
		a.print();
	}
	
	public static void sbTest(){
		StringBuilder sb = new StringBuilder("123");
		sb.append("45678912345678912");
		System.out.println(sb.capacity());
	}
	
	public static void breakTest(){
		int arr [][] = {{1,3,5}, {7,8}};
		out: for(int[] a : arr){
			for(int i : a){
				if(i == 7) continue;
				System.out.print(i);
				if(i == 3){break;}
			}
		}
	}
	
	public static void forTest(){
		for(int i = 0, k = 3; i < k; k--, System.out.println(k)){
			System.out.println("--");
		}

	}
	
	public static void ifTest(){
		int x = 5;
		if(x ++== 5){
			System.out.println(x);
		}
	}
	
	public static void caseTest(){
		final String a = "A";
		String b = "B";
		String c = "C";
		
		switch(a){
		case a: {System.out.println("FIRST");} break;
		default: {System.out.println("DEFAULT"); break;}
		}
	}
	
	public static IOException method(){
		try{
			
			return new IOException("hi");
		}finally{
			System.out.println("finally");
		}
	}
	
	public static void nxt(Object o) {
		String [] y = (String[]) o;
		for(int i = 0; i < y.length; ++i){
			System.out.println(y[i]);
		}
	}
	
	public static void switchTest(int i){
		switch(i){
		case 10: System.out.println(10);
		case 1: System.out.println(1);
		default: System.out.println("default");break;
		case 5: System.out.println(5);
		}
	}
}
