import java.io.*;
import java.util.*;
class animal
{
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
class cat extends animal
{
void sleep()
{
System.out.println("cat is sleeping");
}
}
class hierarchical_inheritance
{
public static void main(String args[])
{
dog D=new dog();
cat C=new cat();
D.move();
D.bark();
C.sleep();
}
}