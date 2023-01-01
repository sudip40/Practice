package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=================================================");
		List<String> str=new ArrayList<>();
		str.add("tanya");
		str.add("gargi");
		str.add("rohit");
		str.add("sumit");
		str.add("amit");
		str.add("sudip");
		Iterator<String> st=str.iterator();
		while(st.hasNext()) {
			System.out.println(st.next());
		}
	}

}
