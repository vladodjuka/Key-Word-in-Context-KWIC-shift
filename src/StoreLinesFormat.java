import java.util.ArrayList;
import java.util.Arrays;

public class StoreLinesFormat {
	private ArrayList<ArrayList<String>> storeDataList;

	public StoreLinesFormat() {

	}

	public ArrayList<ArrayList<String>> readFormat(ArrayList<String> inputDataList) {
		ArrayList<String> data = inputDataList;
		if (data != null) {
			storeDataList = new ArrayList<ArrayList<String>>();

			for (String string : data) {
				ArrayList<String> inner = new ArrayList<String>(Arrays.asList(string.split(" ")));
				storeDataList.add(inner);
			}

			return storeDataList;

		} else {
			System.out.println("Array error detected. NULL array value.");
			return null;
		}
	}

}
