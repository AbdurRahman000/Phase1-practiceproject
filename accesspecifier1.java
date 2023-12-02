package practicePRojectPhase;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    }} 
public class accesspecifier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		priaccessspecifier obj = new priaccessspecifier(); 		  
        obj.display(); 

	}

}
//note:mark one of defAccessSpecifier class and priaccessspecifier class to know the implementation on default and private access specifier
