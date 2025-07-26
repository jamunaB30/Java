class bike
{
 final int speedlimit;
 bike()
 {
  speedlimit=70;
  System.out.println(speedlimit);
}
final void run()
{
System.out.println("running");
}
}
class Honda extends bike
{
public static void main(String args[])
{
Honda F=new Honda();
F.run();
}
}