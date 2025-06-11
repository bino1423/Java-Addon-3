import java.io.*;
import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "results.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split("\\s+");

                if (parts.length < 2) continue; 
                String name = parts[0];
                int totalMarks = 0;

                for (int i = 1; i < parts.length; i++) {
                    totalMarks += Integer.parseInt(parts[i]);
                }

                writer.write(name + ": Total Marks = " + totalMarks);
                writer.newLine();
            }

            System.out.println("Results written to " + outputFile);

        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format in input file.");
        }
    }
}
