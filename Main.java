import java.util.List;
import java.util.LinkedList;
public class Main
{
	public static void main(String[] args) {
	    
	    //Linked List
		List listLinked = new LinkedList();
		
		//1 .add();
		listLinked.add("Rushikesh Tekale");
		listLinked.add(24);
		listLinked.add("Pune");
		
		//2 .indexOf();
		System.out.println(listLinked.indexOf("Pune"));
		
		//3 add by index 
		listLinked.add(2, "Dharashiv");
		System.out.println(listLinked);
		
		// 4 exist
		System.out.println(listLinked.contains("Pune"));
		
		//5 remove
		System.out.println(listLinked.remove(2));
		System.out.println(listLinked);
		
	}
}
