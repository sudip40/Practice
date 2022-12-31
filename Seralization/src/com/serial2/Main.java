package com.serial2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("student.csv");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Student(1,"Sudip","Java",26,"8582833578","Madhyamgram","sudip12345","Sudip40"));
		oos.close();
		fos.close();
		System.out.println("Done");
	}

}
