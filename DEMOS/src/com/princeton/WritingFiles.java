package com.princeton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		//To ensure the file actually exists make it a class throw or it will fall out of scope 

		File file = new File("data2.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
		if(file.exists() == true) {
		
			FileWriter fw = new FileWriter(file.getName());
			//We can append or override the data in the file
			fw.write("String input test");
			fw.write("\n");
			char[] c1 = { 'x', 'y', 'z' };
			fw.write(c1);
			fw.write("\n");
				
			fw.flush();
			fw.close();
		}
	}

}
