interface MathOp{
    void add(int a, int b);
}

public class MethodReferance
{
    public void add(int a, int b){
        System.out.println("Addition is : " + (a+b));
    }
    
	public static void main(String[] args) {
	    
        //Instance Referances
        MethodReferance m1 = new MethodReferance();
        MathOp m =  m1 :: add;
        m.add(50, 30);
	}
}
