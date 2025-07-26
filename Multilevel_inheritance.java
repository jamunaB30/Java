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
class bulldog extends dog
{
void features()
{
System.out.println("Bulldog has sourmug face");
System.out.println("Bulldog is also known as English Dog");
}
}
class Multilevel_inheritance
{
public static void main(String args[])
{
bulldog D=new bulldog();
System.out.println("Animal age is"+D.age);
D.move();
D.bark();
D.features();
}
}