package com.princeton;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class IODemo1 {

	public static void main(String[] args) {
		File file = new File("data.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
		
		//creates a new directory if file type doesnt exist for example if the data.txt was passed is as data it will create a
		//directory folder names that file (data)
		//file.mkdir();
		
		File dir = new File("db","data2.txt");
		dir.mkdir();
		
		//Gives a list of files
		int count = 0;
		 String[] list = file.list();
		 for(String s: list){
			 File f = new File(file, s);
			 if(f.isFile()) {
				 count++;
				 System.out.println(s);
			 }
		 }
		 //how to delete a file
		 file.delete();
	}
}
