import java.util.Scanner;
public class largest{ 
	void large(int a,int b,int c)
	{
		if (a>b && a>c)
			System.out.println("the largest number is:"+a);
		else if(b>c)
			System.out.println("the largest number is:"+b);
		else
			System.out.println("the largest number is :"+c);
	}
	public static void main(String args[])
	{
		largest l1=new largest();
		System.out.println("enter the first number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.println("enter the second number:");
		int b=s.nextInt();
		System.out.println("enter the third number:");
		int c=s.nextInt();
		l1.large(a,b,c);
	}
}