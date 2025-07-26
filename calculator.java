import java.util.Scanner;
class calculator{
	int a,b;
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("result"+c);
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("result"+c);
	}
	void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("result"+c);
	}
	void div(int a,int b)
	{
		if (b!=0)
		{
			int c=a/b;
			System.out.println("result"+c);
		}
		else
		{
			System.out.println("any number cant divided by zero");
		}
	}
	void mod(int a, int b)
	{	
		if(b!=0)
		{
			int c=a%b;
			System.out.println("result"+c);
		}	
		else
		{
			System.out.println("any number cant divided by zero");
		}
	}
        public static void main(String args[])
	{
		calculator cal=new calculator();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first number:");
		int a=s.nextInt();
		System.out.print("enter the second number:");
		int b=s.nextInt();
		System.out.print("choose your option(+,-,*,/,%):");
		char sy=s.next().charAt(0);
		switch (sy)
		{
			case'+':
			{
				cal.add(a,b);
				break;
			}
			case'-':
			{
				cal.sub(a,b);
				break;
			}
			case'*':
			{
				cal.mul(a,b);
				break;
			}
			case'/':
			{
				cal.div(a,b);
				break;
			}
			case'%':
			{
				cal.mod(a,b);
				break;
			}
			default:
			{
				System.out.println("enter valid option");
			}
		}
	}
}