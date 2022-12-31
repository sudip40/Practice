package com.serial;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Employee(2, "Sudip", 100000, "Sudip40", "Sudip40"));
		oos.close();
		fos.close();
		System.out.println("Done");
	}

}
