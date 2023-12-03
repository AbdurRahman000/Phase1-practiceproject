package practicePRojectPhase;
//Default Constructor
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}


//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Default Constructor Call
		EmpInfo emp1=new EmpInfo(); 
		EmpInfo emp2=new EmpInfo();
		emp1.display();
		emp2.display();
		//Parameterized Constructor Call
		Std std1=new Std(7,"msd");
		Std std2=new Std(18,"vrt");
		std1.display();
		std2.display();

		}

	}

