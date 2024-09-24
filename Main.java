import java.util.List;
import java.util.Vector;
import java.util.Iterator;

class Main{
	public static void main(String [] args){
		List al = new Vector();
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

		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}