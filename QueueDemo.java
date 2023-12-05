package practicePRojectPhase;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue battingorder = new LinkedList();
		battingorder.add("rohit");
		battingorder.add("shubman");
		battingorder.add("Virat");
		battingorder.add("Shreyas");
		battingorder.add("Rahul");
System.out.println("Queue is : " + battingorder);
		System.out.println("Head of Queue : " + battingorder.peek());
		battingorder.remove();
		System.out.println("After removing Head of Queue : " + battingorder);
		System.out.println("Size of Queue : " + battingorder.size());

	}

}
