abstract class wipro
{
    abstract void printInfo();
}

class Employee extends wipro{
    void printInfo()
    {
        String name = "Avinash";
        int age = 21;
        float salary = 20000;
        System.out.println("Employee name is:"+name);
        System.out.println("Employee age is:"+age);
        System.out.println("Employee salary is:"+salary);
    }
}

class Absmain{
    public static void main(String args[])
    {
        wipro S = new Employee();
        S.printInfo();
    }
}
