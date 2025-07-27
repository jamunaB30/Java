import java.io.*;
import java.util.*;
public class variable{
	String name;
	int age;
	void setdata(String name ,int age){
		this.name=name;
		this.age=age;
	}
	void getdata()
	{
		int sem=4;
		
		System.out.println("student name is:"+this.name);
		System.out.println("student age is:"+this.age);
		System.out.println("student sem is:"+sem);
		System.out.println("********************************");
	}
	public static void main(String args[])
	{
		
		variable var=new variable();
		variable var1=new variable();
		var.setdata("deepa",21);
		var1.setdata("Shilpa",23);
		var.getdata();
		var1.getdata();
	}
}
	