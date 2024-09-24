import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

class Main{
	public static void main(String [] args){
		List al = new LinkedList();
		al.add("Rushikesh");
		al.add("Rushikesh");
		al.add(10);
		al.add(10);
		al.add(null);
		al.add(null);


		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}