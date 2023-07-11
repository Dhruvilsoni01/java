

public class LearningMethod {

	int i;
	int j;
	
	public void show() {
		int a=1;
		int b=2;
		int sum = a +b;
		String message = "Summation is " + sum; 
		System.out.println(message);
		this.display(a,message,'a',3.2f,true);
	}
	public int display(int k,String a,char c,float f,boolean b)//declare
	{
		int j=200;
		System.out.println("Hello World " + j);
		System.out.println("Receive interger value: "+ k);
		System.out.println("String value received: "+ a);
		System.out.println("Character received value:" + c);
		System.out.println("Float value received: " + f);
		System.out.println("Boolean value received:" + b);
		return 10;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningMethod learn=new LearningMethod(); // Create the object of class.
		learn.show(); // Call created method to use object
	}

}
