import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		//Add element to list
		list1.add("Rushikesh");
		list1.add(7887);
		System.out.println(list1);
		
		//Add to given index 
		list1.add(1, "Tekale");
		System.out.println(list1);
		
        //Print given element at given index
        System.out.println(list1.get(1));
        
        List list2 = new ArrayList();
        list2.add("Pune");
        list2.add("BE");
        
        // Add two list
        list1.addAll(list2);
        System.out.println(list1);
        
        //Check list is empty
        System.out.println(list1.isEmpty());
        
        // Check the element is present in list or not 
        System.out.println(list1.contains("Rushikesh"));
        
        //get the index of element
        System.out.println(list1.indexOf(7887));
        
        //Size of the list
        System.out.println(list1.size());
        
        // remove single element in list
        System.out.println(list1.remove(1));
        System.out.println(list1);
        
        //remove second list from first list
        list1.removeAll(list2);
        System.out.println(list1);
        
        // Delete all the elements from the list
        list1.clear();
        System.out.println(list1);
	}
}
