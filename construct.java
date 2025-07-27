public class construct{
	String name="jamuna";
	int age=18;
	construct()
	{
		System.out.println("the default construct is called");
	}
	construct(String name)
	{
		this.name=name;
	}
	construct(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	construct(construct c)
	{
		this.name=name;
		this.age=age;
	}
	public static void main(String args[])
	{
		construct def=new construct();
		construct par=new construct("deepa");
		construct par1=new construct("shilpa",21);
		construct copy=new construct(par1);
		System.out.println("the student name is:"+def.name+"and age is"+def.age);
		System.out.println("the student name is:"+par.name+"and age is"+par.age);
                System.out.println("the student name is:"+par1.name+"and age is"+par1.age);
                System.out.println("the student name is:"+copy.name+"and age is"+copy.age);
	}
}
