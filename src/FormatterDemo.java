//File Output 
import java.util.Formatter;
import java.util.Locale;

//================ File Output =================


public class FormatterDemo {
	
	public static void main(String[ ] args) {
	   
		// create a new formatter
		try {
		Formatter f = new Formatter("Names.txt");
		
		// print the formatted strings to the file
		f.format("%s %s %s", "1)","Johnny", "Simpson \r\n");
		f.format("%s %s %s", "2)","Thando", "Ndlovu \r\n");
		f.format("%s %s %s", "3)","Kineshi", "Hairo");
		f.close();    
		} 

		catch (Exception e) {
			System.out.println("Error");
		}
	}
}
