package com.deserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos=new FileOutputStream("employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Employee(2,"Sudip",900000,"Sudip40","Sudip40"));
		System.out.println("Done");
		oos.close();
		fos.close();
		
		InputStream fos1=new FileInputStream("employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fos1);
		Employee e=(Employee) ois.readObject();
		System.out.println(e);
		ois.close();
		fos1.close();
	}

}
