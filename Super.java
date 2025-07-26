class Parent { 
    void message() 
    { 
        System.out.println("This is Parent class\n"); 
    } 
} 
class Child extends Parent
{ 
    void message() 
    { 
        System.out.println("This is Child class"); 
    } 
 
    void display() 
    { 
        message();
        super.message(); 
    } 
} 
class Super { 
    public static void main(String args[]) 
    { 
        Child C = new Child(); 
       // calling display() of Student 
        C.display(); 
    } 
}
