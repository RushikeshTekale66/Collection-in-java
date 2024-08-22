import java.util.List;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    
	    //Array List
		List listArray = new ArrayList();
		
		//1 .add();
		listArray.add("Rushikesh Tekale");
		listArray.add(24);
		listArray.add("Pune");
		
		//2 .indexOf();
		System.out.println(listArray.indexOf("Pune"));
		
		//3 add by index 
		listArray.add(2, "Dharashiv");
		System.out.println(listArray);
		
		// 4 exist
		System.out.println(listArray.contains("Pune"));
		
		//5 remove
		System.out.println(listArray.remove(2));
		System.out.println(listArray);
		
	}
}
