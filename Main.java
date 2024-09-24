import java.util.TreeMap;
import java.util.Map;
public class Main {
	public static void main(String [] args){
		Map m = new TreeMap();
		m.put(5, "Rushikesh");
		m.put(4, "Rushikesh");
		m.put(4, "Rushikesh");
		m.put(3, "Tekale");

		System.out.println(m.values());
		System.out.println(m.keySet());
	}
}