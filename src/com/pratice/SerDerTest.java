package com.pratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerDerTest {

	public static void main(final String args[]) throws IOException, ClassNotFoundException {

		SerEvent e = new SerEvent();

		e.setName("Vamsi");
		e.setVenue("Warren PKWY");

		final OutputStream os = new FileOutputStream("C:\\Users\\yalag\\Desktop\\abc.ser");

		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(e);

		InputStream is = new FileInputStream("C:\\Users\\yalag\\Desktop\\abc.ser"); // Deserialization

		ObjectInputStream ois = new ObjectInputStream(is);							 // Deserialization

		final SerEvent e1 = (SerEvent) ois.readObject(); 								// Deserialization

		System.out.println("Name is " + e1.getName()); 										// Deserialization
		System.out.println("Address is " + e1.getVenue());

	}

}
