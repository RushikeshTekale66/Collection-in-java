import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Main
{
	public static void main(String [] args) {
		List <Integer> l1 = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		Stream<Integer> st = l1.stream();

		//Filter method : Filter record & add the result in result1
		System.out.println("\nfilter()");
		List<Integer> result1 = st.filter(i->i%2==0).collect(Collectors.toList());
		System.out.print(result1);


        System.out.println("\n\nmap() ");
		l1.stream().map(num->num*num).forEach((a)->System.out.print(a + ", "));
		
		System.out.println("\n\nsorting()");
		l1.stream().sorted().forEach((a)->System.out.print(a + ", "));
		
		System.out.println("\n\nmin()");
	    Integer result4 = 	l1.stream().min((a, b)->a.compareTo(b)).get();
	    System.out.println(result4);
	}
}
