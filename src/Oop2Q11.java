//11) Create an Abstract class Processor with int member variable data and method showData to display
//data value.
//Create abstract method process() to define processing of member data.
//Create a class Factorial using abstract class 	Processor to calculate  and print 	factorial of a number
//by overriding the process method.
//Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding
//the process method Ask user to enter choice (factorial 	or circle area). Also ask data to work upon;
//Use Processor class reference to achieve this mechanism.
import java.util.Scanner;
abstract class Processor {
    int data;
    public void show(int data){
        this.data=data;
        System.out.println("Show Data: "+data);
    }
    abstract void process(int data);
}
class Factorial extends Processor{
    int fac = 1, i;
    void process(int data){
        this.data=data;

        for (i = 2; i <= data; i++)
            fac *= i;
        System.out.println("Factorial of "+data+" is: "+fac);
    }
}
class Circle extends Processor{
    double pie =3.14;
    double area;
    void process(int data){
        this.data =data;
        area = data*data*pie;
        System.out.println("Area of Circle: "+area);
    }
}
class Result{
    public static void main(String []args){
        Scanner v= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int data = v.nextInt();
        System.out.println("Enter the choice (for Factorial 1 and for Area of Circle 2): ");
        int choice= v.nextInt();
        Processor select;
        if(choice == 1){
            select = new Factorial();
            select.show(data);
            select.process(data);
        } else if (choice == 2) {
            select = new Circle();
            select.show(data);
            select.process(data);
        }
        else
            System.out.println("Invalid Choice");
    }
}