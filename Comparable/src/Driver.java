import java.util.ArrayList;
import java.util.Collections;


public class Driver {

	
	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(5);
		myList.add(1);
		myList.add(3);
		myList.add(2);
		myList.add(10);
		
		for (int x: myList) {
			System.out.println(x);
		}
		
		// Collections.sort can sort integers out of the box
		// (no need to implement Comparable or Comparator for ints
		Collections.sort(myList);
		System.out.println("**after sorting**");

		for (int x: myList) {
			System.out.println(x);
		}
		
		
		Show show1 = new Show("House of the Dragon", 2022, 9);
		Show show2 = new Show("Better Call Saul", 2014, 8.6);
		Show show3 = new Show("Ozark", 2017, 8.5);
		Show show4 = new Show("The Good Doctor", 2017, 7.9);
		
		ArrayList<Show> shows = new ArrayList<Show>();
		shows.add(show1);
		shows.add(show2);
		shows.add(show3);
		shows.add(show4);

		for (Show x: shows ) {
			System.out.println(x);
		}
		
		// The sort method cannot sort Show objects unless you 
		// implement Comparable or Compartor for the Show Class
		Collections.sort(shows);
		System.out.println("After sorting****");
		for (Show x: shows ) {
			System.out.println(x);
		}
	}
}
