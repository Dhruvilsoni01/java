public class Calculator {

	/*Calculator with static values in global variable */
	
	   int i=10,j=60;//Global variable
	public static void main(String[] args) {

		System.out.println("Calculator in Java");
		Calculator cal=new Calculator(); // Create the object
		cal.add(); // Call methods to use the reference variable of object
		cal.sub();
		cal.mul();
		cal.div();
		
		}
	public int add() //Addition
	{
		int a= i+j;
		System.out.println("\n Addition of two value is " + a);
		return 0;
	}
	public int sub()   //Subtraction
	{
		int b= i+j;
		System.out.println("\n Subtraction of two value is " + b);
		return 0;
	}
	public int mul()   //Multiplication
	{
		int c= i*j;
		System.out.println("\n Multiplication of two value is " + c);
		return 0;
	}
	public int div()   //Divide
	{
		int d= j/i;
		System.out.println("\n Divide of two value is " + d);
		return 0;
	}
	
	}

