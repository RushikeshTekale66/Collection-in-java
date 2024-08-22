import java.util.Set;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		Set hs = new HashSet();
		
       		 //Add element to HashSet		
		hs.add(100);
		hs.add("Rushikesh");
		hs.add ("Tekale");
		hs.add("Tekale");
		System.out.println(hs);
		
        		//Add two HashSet
		Set hs2 = new HashSet();
		hs2.add("Rohan");
		hs2.add("Kolegaon");
		
		hs.addAll(hs2);
		System.out.println(hs);
		
		//check element present in HashSet
		System.out.println(hs.contains("Rushikesh"));
		
		//Check HashSet present in HashSet
		System.out.println(hs.containsAll(hs2));
		
		//remove element in HashSet
		hs2.remove("Rohan");
		System.out.println(hs);
		
		//size of HashSet
		System.out.println(hs.size());
		
	}
}
