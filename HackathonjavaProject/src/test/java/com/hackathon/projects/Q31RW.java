package com.hackathon.projects;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Q31RW {
	
	//Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				String userDir = System.getProperty("user.dir");
				String filesaperator = System.getProperty("file.separator");
				System.out.println(filesaperator);
				BufferedReader bufferedReader = new BufferedReader(new FileReader(userDir+filesaperator+"Testfiles"+filesaperator+"input.txt"));
			   BufferedWriter fileWriter = new BufferedWriter(new FileWriter( userDir+filesaperator+"Testfiles"+filesaperator+"Output.txt"));
				
				
				 ArrayList<String> lines = new ArrayList<>();
				    for (int i = 0; i < 10; i++) {
				      lines.add(bufferedReader.readLine());
				    }

				    // Reverse the order of the lines
				    Collections.reverse(lines);
				    String line;
				    // Write the lines to the output file
				    for (String RS : lines) {
				      fileWriter.write(RS + "\n");
				    }
			    while ((line = bufferedReader.readLine()) != null) {
			        fileWriter.write(line + "\n");
			   
			    }
			    
			    bufferedReader.close();
			    fileWriter.close();
			    System.out.println("Sucessfully Written in Reverse order");
}
}