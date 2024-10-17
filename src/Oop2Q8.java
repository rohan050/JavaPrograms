//8) Create a class Student with two members : rollno and percentage.
//Create default and parameterized constructors. Create method show() to 	display information.
//Create another class CollegeStudent inherits Student class. Add a new membersemester to it. Create default
//and parameterized constructors. Also override show() method.
//Create another class SchoolStudent inherits Student class. Add a new memberclassname(eg 12 th ,10 th etc.)
//to it. Create default and parameterized 	constructors. Also override show() method.
//Create a class(say XYZ) with main method that carries out the operation of the project :
//has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
//create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
//display all record from the array.
//search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.
//count how many students are having A grade,if for A grade percentage >75.
import java.util.Scanner;

class Student{
    private int rollno;
    private double percentage;
    public Student(int rno,double per){
        rollno=rno;
        percentage = per;
        rno++;
    }
    public Student(){

    }
    public void show(){
        System.out.println("Roll number: "+rollno);
        System.out.println("Percentage: "+ percentage);
    }
}
class CollegeStudent extends Student{
    private int membersemester;
    public CollegeStudent(int ms){
        membersemester=ms;
    }
    public CollegeStudent(){

    }

    @Override
    public void show() {
        super.show();
    }
}
class SchoolStudent extends Student{
    private int memberclassname;
    public SchoolStudent(int mcn){
        memberclassname=mcn;
    }
    public SchoolStudent(){

    }
    @Override
    public void show() {
        super.show();
    }
}
class ABC{
    public static void main(String []args){
        Scanner v=new Scanner(System.in);
        Student []obj=new CollegeStudent[5];
        obj[5]=new SchoolStudent();
        System.out.println("Enter the Roll number of Students: ");
        for(int i=0; i<5;i++){
            int roll = v.nextInt();
            obj[i]=new CollegeStudent(roll);
            obj[i]=new SchoolStudent(roll);
        }
    }
}