package Programs;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			FileWriter myWriter = new FileWriter("D:\\file1.txt");
			myWriter.write("Java Addon");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An Error Occured");
			e.printStackTrace();
		}
		
	}

}
