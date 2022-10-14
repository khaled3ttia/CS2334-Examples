
public class Show implements Comparable<Show> {

	private int year;
	private double rating; 
	private String name;
	
	public Show(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	
	public String toString() {
		return name;
	}
	
	public int compareTo(Show other) {
		// Compare based on year first
		// if years are identical, compare based on rating
		if (Integer.compare(year, other.year) == 0) {			
			return Double.compare(rating, other.rating);
		}
		return Integer.compare(year, other.year);
	}
	
}
