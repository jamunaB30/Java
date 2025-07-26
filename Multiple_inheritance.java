import java.io.*;
import java.util.*;
interface animal
{
void move();
}
interface dog
{
void bark();
}
class bulldog implements animal,dog
{
 public void move()
{
  System.out.println("Animal is moving");
}
 public void bark()
{
 System.out.println("Animal is barking");
}
}
class Multiple_inheritance
{
public static void main(String args[])
{
bulldog D=new bulldog();
D.move();
D.bark();
}
}