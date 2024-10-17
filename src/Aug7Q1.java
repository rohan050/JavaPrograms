//Write a Java program to sort a numeric array and a string array
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.Scanner;
class Q1 {
    int arr[];
    int swap=0;
    public void setArr(int arr[]){
        this.arr=arr;
    }
    public void sort(){
        for(int i =0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

            }
        }
    }
}

class Q4{
    public static void main(String args []){
        Scanner e = new Scanner(System.in);

        System.out.println("Enter the Size of Array: ");
        int s=e.nextInt();

        int a[]=new int[s];
        int i,swap=0,j;
        System.out.println("Enter the number of Elements: ");
        for(i=0; i<a.length; i++){
            a[i]=e.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++)
                if(a[i]>a[j]){
                    swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
        }
        for(i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
