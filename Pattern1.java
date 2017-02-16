package JavaCoding;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c=0;
		
		for(a=1;a<=5;a++)
		{
			for(b=5;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(c=a;c>=1;c--)
			{
				System.out.print(c);
			}
			System.out.println();
		
		}
	}
	
	

}
