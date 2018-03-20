package com.pratice;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class InputOutputStraem {
	
	public void writeFile() throws IOException	{
		File f = new File("C:\\Users\\yalag\\Desktop\\abc.txt");
		
		OutputStream os = new FileOutputStream(f);
		
		String s = "Hello how are you";
		
		os.write(s.getBytes());
		
		os.close();
	}

	public static void main(String[] args) throws IOException {
		
		InputOutputStraem ios = new InputOutputStraem();
		
		ios.writeFile();
		
	}

}