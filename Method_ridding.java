class vechile
{
void run()
{
System.out.println("vechile is running");
}
}
class bike extends vechile
{
void run()
{
System.out.println("bike is running safely");
}
}
class Method_ridding
{
public static void main(String args[])
{
 bike obj=new bike();
 obj.run();
}
}