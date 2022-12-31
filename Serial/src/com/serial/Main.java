package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("studentoutput.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Student(1, "Ram", 590, "Ram40", "Ram12345"));
		System.out.println("Done Writting");
		fos.close();
		oos.close();

		InputStream is = new FileInputStream("studentoutput.txt");
		ObjectInputStream ois = new ObjectInputStream(is);
		Student s = (Student) ois.readObject();
		System.out.println(s);
		System.out.println("Done Reading");
		is.close();
		ois.close();
	}

}
