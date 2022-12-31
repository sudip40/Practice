package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Student(1,"Sudip","Java",26,"8582833578","Madhyamgram","sudip12345","Sudip40"));
		System.out.println("Done");
		fos.close();
		oos.close();
		
		InputStream is=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(is);
		Student s=(Student) ois.readObject();
		System.out.println(s);
		is.close();
		ois.close();
	}

}
