//Practice these simple ArrayList program in java.
//13. Write a Java program that swaps two elements in an array list.
//14. Write a Java program to join two array lists.
//15. Write a Java program to clone an array list to another array list.
//16. Write a Java program to empty an array list.
//17. Write a Java program to test whether an array list is empty or not.
//18. Write a Java program for trimming the capacity of an array list.
//19. Write a Java program to increase an array list size.
//20. Write a Java program to replace the second element of an ArrayList with the specified element.
//21. Write a Java program to print all the elements of an ArrayList using the elements' position.
/*import java.util.ArrayList;
import java.util.Iterator;
1.Write a Java program to iterate through all elements in an array list.
class AssignmentQ1 {
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("Golmaal");
        al.add(4);
        al.add(867);
        al.add('a');
        Iterator itr= al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
*/
/*2. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;
import java.util.Iterator;
class AssignQ2{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add("Salman");
        al.add("Superman");
        al.add("Hanu-man");
        al.add(7789);

        al.add(0,"Krrish");
        Iterator itr=al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
 */
/*
3. Write a Java program to retrieve an element (at a specified index) from a given array list.
import java.util.ArrayList;
class AssignQ3{
    public static void main(String []args){
        ArrayList al =new ArrayList();
        al.add(37);
        al.add("Volume");
        al.add("Roman Riegns");
        al.add('f');

        System.out.println(al.get(2));
    }
}
*/
/*4. Write a Java program to update an array element by the given element.

import java.util.ArrayList;
class AssignQ4{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(37);
        al.add("Volume");
        al.add("Roman Riegns");
        al.add('f');

        al.set(2,474);
        System.out.println(al);
    }
}
 */
/*5. Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
class AssignQ5{
    public static void main(String []args){
        ArrayList al = new ArrayList();
        al.add(347);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("China");
        System.out.println(al);

        al.remove(3);
        System.out.println(al);
    }
}
 */
/*6. Write a Java program to search for an element in an array list.
import java.util.ArrayList;
class AssignQ6{
    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(347);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("China");
        if(al.contains(347)){
            System.out.println("Yes element 347 is Available");
        }
        else {
            System.out.println("No its not Available");
        }
    }
}
 */
/*7. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.Collections;

class AssignQ7{
    public static void main(String []args){
        ArrayList al =new ArrayList();
        al.add("Singapore");
//        al.add(467465);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("7");
        al.add("5");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
 */
/*8.Write a Java program to copy one array list into another.
import java.util.ArrayList;
import java.util.Collections;
class AssignQ8{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add("Singapore");
        al.add(467465);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("7");
        al.add("5");

        ArrayList al2=new ArrayList();
        al2.add("Golmaal");
        al2.add(4);
        al2.add(867);
        al2.add('a');
        System.out.println(al2);
        al=(ArrayList)al2.clone();
//        al2=al;
        System.out.println(al);
        System.out.println(al2);
    }
}
 */
/*9. Write a Java program to shuffle elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

class AssignQ9{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add("Singapore");
        al.add(467465);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("7");
        al.add("5");
        System.out.println(al);
        Collections.shuffle(al);
        System.out.println(al);
    }
}
 */

/*10.Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;

class AssignQ10{
    public static void main(String []args){
        ArrayList al=new ArrayList();
        al.add("Singapore");
        al.add(467465);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("7");
        al.add("5");
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
 */

/*11.Write a Java program to extract a portion of an array list.

import java.util.ArrayList;
import java.util.List;

class AssignQ11{
    public static void main(String []args){
        ArrayList al = new ArrayList();
        al.add("Singapore");
        al.add(467465);
        al.add("Handlume");
        al.add("Dimple Kapadia");
        al.add("7");
        al.add("5");
        System.out.println(al);
        List l=al.subList(2,4);
        System.out.println(l);
    }
}
 */


//12. Write a Java program to compare two array lists.
