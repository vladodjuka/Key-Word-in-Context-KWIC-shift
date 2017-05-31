import java.util.ArrayList;

public class CircularShiftLines {

	public static ArrayList<String> shiftLines(ArrayList<ArrayList<String>> arr) {
		ArrayList<String> shifted = new ArrayList<String>();

		for (ArrayList<String> arrayList : arr) {
			for (int i = 0; i < arrayList.size(); i++) {
				shifted.add(generateStringFromList(arrayList));
				arrayList = shiftOnce(arrayList);
			}
		}

		return shifted;
	}

	public static ArrayList<String> shiftOnce(ArrayList<String> listValues) {

		String temp = listValues.get(0);
		listValues.remove(0);
		listValues.add(temp);

		return listValues;
	}

	public static String generateStringFromList(ArrayList<String> listToJoin) {
		String st = "";
		for (String string : listToJoin) {
			st += string + " ";
		}

		return st.substring(0, st.length() - 1);

	}

}
