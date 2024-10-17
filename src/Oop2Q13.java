import java.util.Scanner;

//Explain the importance of toString() and equals() method of the Object class and override them on
//class Employee (empId,name,salary).
//Create class for main method(say XYZ),and accept five employees information and store in an array.
//Also ensure if entered empId already exist or not (use equals method).
//Display all employee info using toString() method.
class Employee1 {
    int empId;
    String name;
    int salary;
    public Employee1(int empId, String name,int salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;
    }
}
class MainMethod{
    public static void main(String []args){
        Scanner v=new Scanner(System.in);
        int empId[]= new int[5];
        String name[]=new String[5];
        int salary[]=new int[5];
        for(int i =0;i<5;i++){
            empId[i]=v.nextInt();
            name[i]=v.next();
            salary[i]=v.nextInt();
            Employee1 obj=new Employee1(empId[i],name[i],salary[i]);
            System.out.println(empId[i]+" "+name[i]+" "+salary[i]);
        }
    }
}
