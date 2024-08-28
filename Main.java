
public class Main
{
	public static void main(String[] args) {
	    
	    MathOp m = (int a, int b)->{return a+b;};
	    System.out.println("Addition of two number is " + m.add(10, 20));
	    
	    MathOp m2 = (a, b)->a+b;
	    System.out.println("Addition is : " + m2.add(10, 20));
	}
}

@FunctionalInterface
interface MathOp{
    public abstract int add(int a, int b);
}
