interface MathOp{
	void add(int a, int b);
}

class SMethodReferance{

	public static void add(int a, int b){
       	System.out.println("Addition is : " + (a+b));
	}

	public static void main(String [] args){
		MathOp mr = SMethodReferance :: add;
		mr.add(10, 20);
	}
}