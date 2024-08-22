import java.util.Set;
import java.util.TreeSet;
public class Main
{
	public static void main(String[] args) {
		Set ts = new TreeSet();
		
        //Add element to TreeSet
		ts.add("Rushikesh");
		ts.add ("Tekale");
		ts.add("Tekale");
		System.out.println(ts);
		
        //Add two TreeSet
		Set ts2 = new TreeSet();
		ts2.add("Rohan");
		ts2.add("Kolegaon");
		
		ts.addAll(ts2);
		System.out.println(ts);
		
		//check element present in TreeSet
		System.out.println(ts.contains("Rushikesh"));
		
		//Check TreeSet present in TreeSet
		System.out.println(ts.containsAll(ts2));
		
		//remove element in TreeSet
		ts2.remove("Rohan");
		System.out.println(ts);
		
		//size of TreeSet
		System.out.println(ts.size());
		
	}
}
