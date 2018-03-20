package com.pratice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWriter {

	public void readFile(String path) throws IOException {
	
		FileReader reader = new FileReader(path);
		
		BufferedReader br = new BufferedReader(reader);
		
		
		try {
			
			String line;
				while ((line = br.readLine()) != null ) {
					System.out.println("Character retrieved " + line);
				}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
		
	}

public static void main(String args[]) throws FileNotFoundException {
	FileReadWriter frw = new FileReadWriter();
	try {
		frw.readFile("C:\\Users\\yalag\\Desktop\\abc.txt");
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}