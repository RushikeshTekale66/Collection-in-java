import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) {
		
		Map <Integer, String> hm = new HashMap<Integer, String>();
		
		//Add element to HashMap
		hm.put(1, "Rushi");
		hm.put(5, "Rohan");
		hm.put(2, "Ramesh");
		hm.put(4, "Tushar");
		hm.put(3, "Adinath");
		
		System.out.println(hm);
		
		//Add Map element to the set 
		System.out.println(hm.entrySet());
		Set s = hm.entrySet();
		
		//Iterate using Iterator
        Iterator itr = s.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Add key to the set 
        System.out.println(hm.keySet());
		
	}
}
