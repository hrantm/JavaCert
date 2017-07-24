package sectionTests;
import java.math.*;
import java.util.regex.*;

import javax.management.ImmutableDescriptor;

import java.text.*;
import java.time.Year;
import java.io.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.function.DoublePredicate;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Test {

	static int x = 10;
	
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		list.add(21.6);
		list.add(21.39);
		list.add(21.5d);
		list.add(21.41);
		
		DoublePredicate  ip = i -> i > 21.4;
		
		for(Double d : list){
			if(ip.test(d)){
				System.out.println(d);
			}
		}
	}
	
}

//enum Speed{
////	FAST(2);
////	FASTER(3);
////	SLOW(1);
//	
//	private final int speed;
//	
//	Speed(int speedCode){
//		this.speed = speedCode;
//	}
//}
