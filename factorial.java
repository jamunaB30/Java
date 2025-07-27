import java.io.*;
import java.util.Scanner;
class factorial{
	public static void main(String args[])
	{
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int fact=1,i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("the factorial number is:"+fact);
	}
}