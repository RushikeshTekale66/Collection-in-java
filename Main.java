import java.util.Set;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		
		Set set1 = new HashSet();
		
		//Add element
		set1.add("Rushikesh");
		set1.add("Tekale");
		set1.add(7887);
		set1.add("Pune");
		System.out.println(set1);

        //Add set in set
        Set set2 = new HashSet();
        set2.add("Rohan");
        set2.add("Tekale");
        set2.add(8263);

        set1.addAll(set2);
        System.out.println(set1);
		
		//Check element contain set1
		System.out.println(set1.contains(7887));

        //Check set2 elements in set1
        System.out.println(set1.containsAll(set2));
		
		//remove element from set 
		set1.remove("Pune");
		System.out.println(set1);

        //check set is empty or not
        System.out.println(set1.isEmpty());

        //remove the element in set
        System.out.println(set1.remove(7887));

        //remove set2 in set1
        System.out.println(set1.removeAll(set2));
		
		//size of set 
		System.out.println(set1.size());

        // print set element
        System.out.println(set1);
	}
}
