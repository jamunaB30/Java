import java.util.Scanner;
import java.io.*;
class branch{
	public static void main(String args[])
	{
		System.out.println("enter the branch name:");
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		switch (id)
		{
		case"cs":
		{
			System.out.println("cs-computer science and engg");
			break;
                }
		case"ec":
		{
			System.out.println("ec-electronics and communication");
			break;
		}
		case"me":
		{
			System.out.println("me-mechanical and communication");
			break;
		}
		case"ee":
		{
			System.out.println("ee-electrical and electronic");
			break;
		}
		default:	
		{
			System.out.println("invalid branch id");
			break;
		}
		}
	}
}