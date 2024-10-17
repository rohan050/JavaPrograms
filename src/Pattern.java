////import java.util.ArrayList;
////
////class Q{
////    public static void main(String []args){
////        ArrayList al=new ArrayList();
////        al.add(1);
////        al.add('f');
////        al.add("Hello");
////        System.out.println(al);
////    }
////
////import java.util.HashMap;
////class Q{
////    public static void main (String []args){
////        HashMap hm=new HashMap();
////        hm.put(3,"Rohsan");
////        hm.put(1,"Rehaan");
////        hm.put(4,"Rehsan");
////        hm.put(5,"Rohan");
////        System.out.println(hm);
////    }
////}
//class Mgain {
//    public static void main(String[] args) {
//        int[] arr1 = {1, 3, 5, 7, 0, 0, 0, 0};
//        int[] arr2 = {2, 4, 6, 8};
//
//        mergeSortedArrays(arr1, arr2);
//
//        // Print the merged array
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
//    }
//
//    public static void mergeSortedArrays(int[] arr1, int[] arr2) {
//        int i = arr1.length - 1;
//        int j = arr2.length - 1;
//        int k = arr1.length - 1;
//
//        while (j >= 0) {
//            if (i >= 0 && arr1[i] > arr2[j]) {
//                arr1[k--] = arr1[i--];
//            } else {
//                arr1[k--] = arr2[j--];
//            }
//        }
//    }
//}
class QQ3{
     public static void main(String []args){
         int a=5;
         for(int i=9;i>0;i--){
             if(i%2!=0){
                 for(int j=i;j>0;j--){
                     if(j>((i/2)+1)){
                         System.out.print(a);
                         a--;
                     }
                     else {
                         System.out.print(a);
                         a++;
                     }
                 }
                 a=a-1;
                 System.out.println();
             }
         }
     }
}