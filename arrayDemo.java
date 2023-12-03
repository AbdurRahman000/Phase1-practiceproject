package practicePRojectPhase;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single-dimensional array
		int sum=0;
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
			sum=sum+a[i];
		System.out.println("sum of array a: "+sum);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9} };
		      
		      System.out.println("\nnumber  of  1: " + b[0].length);
		      }

	}


