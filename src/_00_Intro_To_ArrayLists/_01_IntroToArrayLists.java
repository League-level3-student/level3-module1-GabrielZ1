package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		//    Don't forget to import the ArrayList class

		ArrayList<String> arrList = new ArrayList<String>();

		// 2. Add five Strings to your list

		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		arrList.add("e");

		// 3. Print all the Strings using a standard for-loop

		for(int i = 0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		// 4. Print all the Strings using a for-each loop

		for(String s: arrList) {
			System.out.println(s);
		}

		// 5. Print only the even numbered elements in the list.

		for(int i = 0; i<arrList.size(); i += 2) {
			System.out.println(arrList.get(i));
		}

		// 6. Print all the Strings in reverse order.

		for(int i = arrList.size()-1; i>=0; i--) {
			System.out.println(arrList.get(i));
		}

		// 7. Print only the Strings that have the letter 'e' in them.

		for(String s: arrList) {
			if(s.contains("e")) {
				System.out.println(s);
			}
		}

	}
}
