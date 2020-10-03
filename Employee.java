import java.util.*;
class Employee
{
    int age;
    long days;
    long salary;
    long overtime;
    long phone;
    String name;
    long gross;
    double rate;
    void accept()
    {
        Scanner Scan=new Scanner(System.in);
        System.out.print("Enter your name: ");
        name=Scan.next();
        System.out.print("Enter your Phone No.: ");
        phone=Scan.nextLong();
        System.out.print("Enter your age: ");
        age=Scan.nextInt();          
        System.out.print("Enter your Basic Salary: ");
        salary=Scan.nextLong();
        System.out.print("Total present days: ");
        days=Scan.nextInt();
        System.out.print("Enter Overtime(in hrs): ");
        overtime=Scan.nextInt();
        System.out.print("Enter rate: ");
        rate=Scan.nextDouble();
        gross = (long) ((salary*days/30)+(overtime*rate));
        days= days + overtime/24;
    }
    void display()
    {
         System.out.println("\nName: "+name);
         System.out.println("Phone No.: "+phone);
         System.out.println("Age: "+age);
         System.out.println("Present days: "+days);
         System.out.println("Gross Salary: "+gross);
    }
    public static void main(String args[])
    {
        Employee obj=new Employee();
        obj.accept();
        obj.display();
    }
}
