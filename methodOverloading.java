package practicePRojectPhase;

public class methodOverloading {

	public void sum(int a,int b)
    {
         System.out.println("sum of two numbers : "+(a+b));
    }
    public void sum(int a,int b,int c) 
    {
         System.out.println("sum of three numbers : "+(a+b+c));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading ob=new methodOverloading();
	       ob.sum(10,12);
	       ob.sum(5,8,4);  

	}

}
