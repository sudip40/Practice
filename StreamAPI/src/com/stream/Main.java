package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(list);
		System.out.println("==========================================");
		List<Integer> list2= list.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		
		System.out.println("==============================================");
		
		List<Integer> list3=list.stream().map((i)->i*i).collect(Collectors.toList());
		System.out.println(list3);
		System.out.println("==============================================");
		
		list.stream().forEach((i)->System.out.println(i));
		System.out.println("==============================================");
		System.out.println("Sorted Assending: ");
		list.stream().sorted().forEach((i)->System.out.println(i));
		System.out.println("==============================================");
		System.out.println("Sorted Dessending: ");
		list.stream().sorted((x,y)->y-x).forEach((i)->System.out.println(i));
		System.out.println("==============================================");
		
		List<String> list1=new ArrayList<>();
		list1.add("Sudip");
		list1.add("Amit");
		list1.add("Arun");
		list1.add("Pradeep");
		list1.add("Dipa");
		list1.add("Rohit");
		list1.add("Sumit");
		System.out.println("String Sorting: ");
		list1.stream().sorted((x,y)->x.compareTo(y)).forEach((i)->System.out.println(i));
		System.out.println("==============================================");
		System.out.println("String Sorting Desending: ");
		list1.stream().sorted((x,y)->y.compareTo(x)).forEach((i)->System.out.println(i));
	}

}
