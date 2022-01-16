//File Input
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// ================ File Input =================

public class textMaker {

    public static void main(String args[]) throws FileNotFoundException {
  
        //Creating File instance to reference text file in Java
        File text = new File("Read Lines.txt");
      
        //Creating Scanner instance to read File in Java
        Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println(line);
            lineNumber++;
        }       
    }   
}

