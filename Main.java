import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {
	public static void main(String [] args){
		Set hs = new HashSet();
		hs.add("Rushikesh");
		hs.add("Rushikesh");
		hs.add(100);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		hs.add("Rohan");
		hs.add("Abhijeet");

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}