//Create three classes  Faculty  (facultyid, salary),
//FullTimeFaculty  (basic, allowance) inherits class Faculty,
//PartTimeFaculty  (hour, rate) inherits class Faculty.
//Create   a   method   for   accepting   input   in
//FullTimeFaculty       and  PartTimeFaculty,  but   salary
//should   not   be   accepted.    salary   is  calculated   on
//the   basis   of   (basic+allowance)   for   FullTimeFaculty
//and  (hour*rate)   for   PartTimeFaculty.   Also   create
//method   in   above   classes   to  display faculty data.
//Create   another   class(say   XYZ)   for   main   method   and
//store   2 fulltime and 2 parttime faculty information. Also print their details.


import java.awt.*;
import java.util.Scanner;

class Faculty{
    private int fId;
    private int s;
    private int c =0;
    public Faculty(int y){
        c++;
        fId = c;
        s=y;
    }
    public int salary(){
        return s;
    }
}
class FullTimeFaculty extends Faculty{
    private int b;
    private int a;
    private int i=0;

    public FullTimeFaculty(int basic, int allowance){
        super(basic + allowance);
        b=basic;
        a=allowance;
        i++;
    }
    public void display(){
        System.out.println("The Basic salary of Emplayee is: "+b);
        System.out.println("The Allowance of the Employee is: "+a);
    }
}
class PartTimeFaculty extends Faculty{
    private int h;
    private int r;
    public PartTimeFaculty(int hour, int rate){
        super(hour * rate);
        h= hour;
        r=rate;
    }
    public void display() {
        System.out.println("The Hours of work done by Part Time Faculty is: "+h);
        System.out.println("The Rate per hour of Faculty: "+ r);
    }
}
class Main{
    public static void main(String  []args){
        Scanner b =new Scanner(System.in);
        int i=0,basic[]=new int[2],allowance[]=new int[2],hour[]=new int[2],rate[]=new int[2];
        for(i = 0; i<2;i++){
            System.out.println("Basic Salary");
            basic[i]=b.nextInt();
            System.out.println("Allowance: ");
            allowance[i]=b.nextInt();
        }
        for (i=0;i<2;i++){
            System.out.println("Hours: ");
            hour[i]=b.nextInt();
            System.out.println("Rate: ");
            rate[i]=b.nextInt();
        }
        for(i=0;i<2;i++){
            FullTimeFaculty obj1=new FullTimeFaculty(basic[i],allowance[i]);
            System.out.println("Salary: "+obj1.salary());
            PartTimeFaculty obj2= new PartTimeFaculty(hour[i],rate[i]);
            System.out.println("Part Time Worker Salary: "+obj2.salary());
        }
    }
}