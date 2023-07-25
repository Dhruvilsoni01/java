

public class loop {

	public static void main(String[] args) {

		//Nested loop
		
		/*
		 * While --> 3
		 * For ---> 4
		 * do While --> 5
		 */
		
		int i=0, k=0;
		
		while(i<3)
		{
			for(int j=0;j<4;j++)
			{
				do
				{
					System.out.println("i--->"+i+"j--->"+j+"k--->"+k);
					k++;
				}while(k<6);
			}i++;
		}
		
	}

}
