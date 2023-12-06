package practicePRojectPhase;

public class BinarySearch {

		public static  void main(String[] args){


	        int[] arr = {3,6,9,12,15};
	        int r = 9;
	        int arrlength = arr.length;
	        binarySearch(arr,0,r,arrlength);
	    }
// TODO Auto-generated method stub
		public static void binarySearch(int[] arr, int start, int s, int length){

	        int midValue = (start+length)/2;
	        while(start<=length){

	            if(arr[midValue]<s){

	                start = midValue + 1;
	            } else if(arr[midValue]==s){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }

	}

	}


