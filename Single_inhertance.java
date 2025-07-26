import java.io.*;
import java.util.*;
class animal
{
int age=15;
void move()
{
	System.out.println("Animal is Moving");
}
}
class dog extends animal
{
void bark()
{
	System.out.println("Dog barking");
}
}
class Single_inhertance
{
public static void main(String args[])
{
dog D=new dog();
System.out.println("Animal age is"+D.age);
D.move();
D.bark();
}
}