
public class Calculator_with_parameter {

	public int getSum(int num1 , int num2) {
		int num3=num1+num2;
		System.out.println("Addition is "+ num3);
		return num3;
	}
	
	public int getSub(int num1 , int num2) {
		int num3=num1-num2;
		System.out.println("Subtraction is "+ num3);
		return num3;
	}
	public int getMul(int num1 , int num2) {
		int num3=num1*num2;
		System.out.println("Multiplication is "+ num3);
		return num3;
	}
	public int getDiv(int num1 , int num2) {
		int num3=num1/num2;
		System.out.println("Divide is "+ num3);
		return num3;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Calculator Demo \n"); 
		// Create the object
		Calculator_with_parameter calc=new Calculator_with_parameter();
		
		// Call methods to use the reference variable
		calc.getSum(12, 20);
		calc.getSub(50, 10);
		calc.getMul(20, 2);
		calc.getDiv(18, 2);
	}

}
