import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputDataFormat {
	private String inputFileName;
	private String outputFileName;

	public InputDataFormat() {
		this.inputFileName = setInputFileName();
		this.outputFileName = setOutputFileName();

	}

	public ArrayList<String> readFile() {
		try {
			ArrayList<String> arr = new ArrayList<String>();
			BufferedReader b = new BufferedReader(new FileReader(inputFileName));
			String sCurrentLine;
			while ((sCurrentLine = b.readLine()) != null) {
				arr.add(sCurrentLine);
			}
			b.close();
			return arr;
		} catch (Exception e) {
		}
		return null;

	}

	public String setInputFileName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input file name: ");
		String st = sc.nextLine();

		return st;
	}

	public String setOutputFileName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter output file name: ");
		String st = sc.nextLine();
		sc.close();
		return st;
	}

	public String getInputFileName() {
		return inputFileName;
	}

	public String getOutputFileName() {
		return outputFileName;
	}

}
