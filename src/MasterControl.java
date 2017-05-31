import java.util.ArrayList;

public class MasterControl {
	public static void main(String[] args) {

		InputDataFormat in = new InputDataFormat();

		StoreLinesFormat st = new StoreLinesFormat();

		ArrayList<String> shiftSort = CircularShiftLines.shiftLines(st.readFormat(in.readFile()));

		shiftSort = AlphabeticalSortLines.sortAlphabetically(shiftSort);

		OutputDataFormat.writeToFile(shiftSort, in.getOutputFileName());
	}

}
