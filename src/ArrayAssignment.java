//Q.9 Find the Union and Intersaction of two sorted array.
//Given two arrays a[] and b[] of size n n and m respectively. The task is to find union between these two arrays.
//Union of the two arrays can be defined as the set containing distinct elements from both the arrays.
// If there are repetitions, then only one occurrence of element should be printed in the union.
//        Example 1:
//Input:
//        5 3
//        1 2 3 4 5
//        1 2 3
//Output:
//        5
//Explanation: 1, 2, 3, 4 and 5 are the elements which comes in the union set of both arrays. So count is 5.
//Example 2:
//Input:
//        6 2
//        85 25 1 32 54 6
//        85 2
//Output:
//        7
//Explanation: 85, 25, 1, 32, 54, 6, and 2 are the elements which comes in the
//union set of both arrays. So count is 7.
import java.util.Scanner;
class Q9{
     public static void main(String []args){
         Scanner v=new Scanner(System.in);
         System.out.println("Enter the Size of Array a[] will be: ");
         int n=v.nextInt();
         System.out.println("Enter the Size of Array b[] will be: ");
         int m=v.nextInt();
         int a[]=new int[n],b[]=new int[m],n1=0;
         System.out.println("Enter the Elements of Array a[]: ");
         for(int i=0; i<a.length;i++){
             a[i]=v.nextInt();
         }
         System.out.println("Enter the Elements of Array b[]: ");
         for(int i=0;i<b.length;i++){
             b[i]=v.nextInt();
         }
         if (n <= m) {
             for(int i=0;i<b.length;i++){
                 for(int j=0;j<n;i++){
                    if(a[i]==b[j]){
                        n1++;
                    }
                 }
             }
         }
     }
}