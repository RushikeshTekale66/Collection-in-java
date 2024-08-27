import java.util.Map;
import java.util.HashMap;
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
		
		//Access value from HashMap
		System.out.println("Value : "+ hm.get(3));
		
		//Remove item form HashMap
		System.out.println("Deleted Item : " + hm.remove(3));
		
		//Size of HashMap
		System.out.println("Size is : " + hm.size());
		
		//Print the keys
		System.out.println("Kyes are : " + hm.keySet());
		
		//Print values
		System.out.println("Values are : " + hm.values());
		
		//Check contains key 
		System.out.println("Key present : " + hm.containsKey(1));
		
		//Check contains values
		System.out.println("Value present : " + hm.containsValue("Rushi"));
		
		//check is empty
		System.out.println("Is empty : " + hm.isEmpty());
		
		//replace/Update the existing key value pair 
		hm.replace(1, "Sourabh");
		System.out.println(hm);
	}
}
