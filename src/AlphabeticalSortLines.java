import java.util.ArrayList;

public class AlphabeticalSortLines {
	public static ArrayList<String> sortAlphabetically(ArrayList<String> listOfShiftedLines) {
		listOfShiftedLines.sort(String::compareToIgnoreCase);
		return listOfShiftedLines;
	}

}
