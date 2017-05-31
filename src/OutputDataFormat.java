import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class OutputDataFormat {
	public static void writeToFile(ArrayList<String> linesToWrite, String fileName) {

		try {
			PrintWriter pw = new PrintWriter(fileName);
			for (String string : linesToWrite) {
				pw.write(string + "\n");
			}
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
