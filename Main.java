
public class Main
{
	public static void main(String[] args) {
	    MathOp m = new MathOp(){
	        @Override
	        public int add(int a, int b){
	            return a+b;
	        }
	    };
	    
	    System.out.println("Addition of two number is " + m.add(10, 20));
	}
}

@FunctionalInterface
interface MathOp{
    public abstract int add(int a, int b);
}
