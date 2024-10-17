import java.util.Scanner;
class Area{
    private int r;
    private double area;
    public void init(int rad){
        r=rad;
    }
    public void calc(){
        area = 3.14*r*r;
    }
    public void display(){
        System.out.println("Area of Circle: "+area);
    }
}
class Print {
    public static void main(String []args){
        Scanner v= new Scanner(System.in);
        Area obj =new Area();
        System.out.println("Enter the Radius : ");
        int num= v.nextInt();
        obj.init(num);
        obj.calc();
        obj.display();
    }
}
