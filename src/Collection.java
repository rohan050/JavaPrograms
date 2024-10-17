import java.io.Serializable;
import java.util.*;
import java.util.ListIterator;
import java.util.TreeSet;
class Collection {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Rahul");
        l.add("karan");
        l.add("Krati");
        System.out.println(l);
        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
//class Stac{
//    public static void main(String []args){
//        Stack obj=new Stack();
//        TreeSet obj1=new TreeSet();
//        obj.push("Golmaal");
//        obj.push("Hai");
//        obj.push("Bhai");
//        System.out.println(obj.peek());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.isEmpty());
//
//        obj1.add(50);
//        obj1.add(40);obj1.add(25);
//        obj1.add(60);
//        obj1.add(10);
//        obj1.add(30);
//        System.out.println(obj1);
//        Iterator it=obj1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        HashMap obj=new HashMap();
//        obj.put(1,"Virat");
//        obj.put(4,"Kohli");
//        obj.put(3,"Sharma has Done it");
//        obj.put(2,"India has Done it");
//        System.out.println(obj);

//        Set obj1=obj.entrySet();
//        System.out.println(obj1);
//
//        obj.remove(1);
//        System.out.println(obj);
//        System.out.println(obj.isEmpty());

//        System.out.println(obj.containsKey(4));
//        Iterator n=obj1.iterator();
//        while (n.hasNext()){
//            Map.Entry entry= (Map.Entry)n.next();
////            System.out.println(n.next());
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
//        }
//        TreeMap tm=new TreeMap();
//        tm.put(101,"Rohan");
//        tm.put(13,"Sharma ji ka ladka");
//        tm.put(65,"Binod");
////        System.out.println(tm.ceilingEntry(12));
////        System.out.println(tm.ceilingKey(154));
////        System.out.println(tm.floorEntry(192));
////        System.out.println(tm);
//        System.out.println(tm.pollFirstEntry());
//        System.out.println(tm.firstEntry());
//    }
//}
