package practicePRojectPhase;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] array = new int[3];
        try 
        {
            array[7] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bounds!"); 
        }
          

}
}
