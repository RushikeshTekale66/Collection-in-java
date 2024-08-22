import java.util.Set;
import java.util.LinkedHashSet;
public class Main
{
	public static void main(String[] args) {
		Set lhs = new LinkedHashSet();
		
        		//Add element to LinkedHashSet		
		lhs.add(100);
		lhs.add("Rushikesh");
		lhs.add ("Tekale");
		lhs.add("Tekale");
		System.out.println(lhs);
		
       		 //Add two LinkedHashSet
		Set lhs2 = new LinkedHashSet();
		lhs2.add("Rohan");
		lhs2.add("Kolegaon");
		
		lhs.addAll(lhs2);
		System.out.println(lhs);
		
		//check element present in LinkedHashSet
		System.out.println(lhs.contains("Rushikesh"));
		
		//Check HashSet present in LinkedHashSet
		System.out.println(lhs.containsAll(lhs2));
		
		//remove element in LinkedHashSet
		lhs2.remove("Rohan");
		System.out.println(lhs);
		
		//size of LinkedHashSet
		System.out.println(lhs.size());
		
	}
}
