//12) Create Interface Taxable with members salesTax=7% and incomeTax=10.5%.Create abstract
//method calcTax().
//Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
//Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit
//price of product.
//Create class for main method(Say XYZ), accept employee information and a product information
//from user and print income tax and sales tax respectively.
interface Taxable {
    double salesTax=7;
    double incomeTax=10.5;
    void calcTax();
}
class Employee implements Taxable{
    int empid;
    String  name;
    int salary;
    public Employee(int eid, String n,int salary){
        empid=eid;
        name=n;
        this.salary=salary;
    }
    int totalSalary;
    double totalTax;
    @Override
    public void calcTax() {
        totalSalary=salary*12;
        totalTax = (totalSalary*incomeTax)/100;
        System.out.println("Income Tax on Yearly Salary: "+totalTax);
    }
    public void show(){
        System.out.println("Employee ID: "+empid);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}
class Product1 implements Taxable{
    int pid;
    int price;
    int quantity;
    public Product1(int p, int pri,int q){
        pid=p;
        price=pri;
        quantity=q;
    }
    double uPT;
    @Override
    public void calcTax(){
        uPT=(price*salesTax)/100;
        System.out.println("Sales Tax on Unit Product: "+uPT);
        System.out.println("Total Sales Tax on basis of Qauntity of Product: "+(uPT*quantity));
    }
    public void show(){
        System.out.println("Product ID: "+pid);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
}
class Suu{
    public static void main(String []args){
        Employee obj1= new Employee(4571,"Manish Wadhava",45000);
        Product1 obj2=new Product1(7471,1200,5);
        obj1.show();
        obj1.calcTax();

        System.out.println();
        obj2.show();
        obj2.calcTax();
    }
}