import java.util.ArrayList;

//import java.util.ArrayList;
//
//class M{
//    public static void main(String []args){
//        ArrayList l=new ArrayList();
//
//        l.add(101);
//        l.add("Vikas");
//        l.add("Rohit");
//        l.add("Virat");
//        System.out.println(l);
//
//        ArrayList l1=new ArrayList();
//        l1.add("Abhay");
//        l1.add("Daksh");
//        l1.add("Sawan");
//        System.out.println(l1);
//
//        l.addAll(l1);
//
//        System.out.println(l);
//
//        System.out.println(l.add("Haha"));
//        l.remove("Virat");
//        System.out.println(l);
//        l.removeAll(l1);
//        System.out.println(l);
//        l.clear();
//        System.out.println(l);
//        System.out.println(l.isEmpty());
//    }
//}
class Storm{
    public static void main(String []args){
        ArrayList al1=new ArrayList();
        al1.add(0,"Hello");
        al1.add(1,"Cello");

        al1.add(2,"Chalo");
        ArrayList al2= new ArrayList(al1);
        System.out.println(al2);

    }
}