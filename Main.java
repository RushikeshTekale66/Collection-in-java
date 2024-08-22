import java.util.List;
import java.util.Vector;
public class Main
{
	public static void main(String[] args) {
	    
	    //Linked List
		List listVector = new Vector();
		
		//1 .add();
		listVector.add("Rushikesh Tekale");
		listVector.add(24);
		listVector.add("Pune");
		
		//2 .indexOf();
		System.out.println(listVector.indexOf("Pune"));
		
		//3 add by index 
		listVector.add(2, "Dharashiv");
		System.out.println(listVector);
		
		// 4 exist
		System.out.println(listVector.contains("Pune"));
		
		//5 remove
		System.out.println(listVector.remove(2));
		System.out.println(listVector);
		
	}
}
