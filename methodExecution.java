package practicePRojectPhase;

public class methodExecution {
	public int factorial(int a ){
		int z=1;
	for (int i=a;i>=1;i--) {
		z=z*i;
	}
		return z;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodExecution b=new methodExecution();
		int ans= b.factorial(9);
		System.out.println("Multipilcation is :"+ans);

	}

}
