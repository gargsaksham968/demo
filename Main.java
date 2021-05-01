package demo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\SA20170554\\Downloads\\ArintraCodingQuestion\\ArintraCodingQuestion\\data2\\Abdominal-Bump.txt");
	  
	  BufferedReader br = new BufferedReader(new FileReader(file));
	  
	  String st;
	  String[] words = null;
	  
	  while ((st = br.readLine()) != null) {
		  words = st.split("\\n");
	  }
	  for(int i=0;i<words.length;i++)
	    System.out.println(words[i]);
	  	
	
}
}