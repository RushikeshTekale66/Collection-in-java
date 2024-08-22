import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
public class Main
{
	public static void main(String[] args) {
		List ts = new ArrayList();
		
        //Add element to TreeSet
		ts.add("Rushikesh");
		ts.add ("Tekale");
		ts.add("Ramesh");
		ts.add("Tekale");

		ListIterator it = ts.listIterator();

		// Forward Iterator
		while(it.hasNext()){
			System.out.println(it.next());
		}

		//backword Iterator
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}
}
