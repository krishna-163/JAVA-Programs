package com.pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputReader {
	
	public static void inputOutputStream() throws IOException {
		
		final File f = new File("C:\\Users\\yalag\\Desktop\\Project Y\\ID_f.jpg");
		
		final InputStream is = new FileInputStream(f);
		
		final OutputStream os = new FileOutputStream("C:\\Users\\yalag\\Desktop\\ID_f.jpg");
		
		int i;
		while ((i = is.read())!= -1)
		{
			os.write(i);
		}
	}

	public static void main(String[] args) throws IOException
	{
		inputOutputStream();
		

	}

}