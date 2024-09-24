import java.util.HashMap;
import java.util.Map;
public class Main {
	public static void main(String [] args){
		Map m = new HashMap();
		m.put(5, "Rushikesh");
		m.put(4, "Rushikesh");
		m.put(4, "Rushikesh");
		m.put(3, "Tekale");
		m.put(null, null);
		m.put(null, null);

		System.out.println(m.values());
		System.out.println(m.keySet());
	}
}