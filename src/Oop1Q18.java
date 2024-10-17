//Create class Product (pid, price, quantity) with parameterized constructor.
// Create a main function in different class (say XYZ) and perform following task:
//Accept five product information from user and store in an array
//Find Pid of product with highest price.
//Create method (with array of product’s object as argument) in XYZ class to
// calculate and return total amount spent on all products.
// (amount spent on single product=price of product * quantity of product).
import java.util.Scanner;
class Product{
    private int pid;
    private double price;
    private int quantity;
    public Product(int id, double pri,  int qty){
        pid = id;
        price = pri;
        quantity = qty;
    }
    public int getPid(){
        return pid;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
class XYZ{
    public static void main(String []args){
        Scanner v= new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=v.nextInt();
        Product []obj= new Product[n];
        for(int i = 0; i<obj.length;i++){
            System.out.println("Enter the Product Id "+(i+1)+": ");
            int pid=v.nextInt();
            System.out.println("Enter the unit price of Product: ");
            int pri = v.nextInt();
            System.out.println("Enter the Quantity of Product: ");
            int quantity= v.nextInt();

            int price = quantity*pri;
            System.out.println("Actual Price of Product after adding by quantity wise is: "+price);
            obj[i]= new Product(pid, price,quantity);
        }
        int pidHP=obj[0].getPid();
        double highestPrice=obj[0].getPrice();
        for(int i=1; i<obj.length;i++){
            if(obj[i].getPrice()>highestPrice){
                highestPrice=obj[i].getPrice();
                pidHP=obj[i].getPid();
            }
        }
        System.out.println("Product ID of Highest price product is: "+pidHP);
        double total= totalSpent(obj);
        System.out.println("Total Amount Spent on Products: "+total);
    }
    public static double totalSpent(Product []obj){
        double totalAmount=0.0;
        for(Product product : obj){
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }
}