import java.util.Scanner;
public class evenodd{
	public static void main(String args[])
	{
		evenodd l1=new evenodd();
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if (a%2==0)
		
			System.out.println("the given number is even");
		 else
			System.out.println("the given number is odd");
		
	}
}
		