import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
public class Main
{
	public static void main(String[] args) {
		Set ts = new TreeSet();
		
        //Add element to TreeSet
		ts.add("Rushikesh");
		ts.add ("Tekale");
		ts.add("Ramesh");
		ts.add("Tekale");

		Iterator it = ts.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
