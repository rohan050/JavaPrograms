@FunctionalInterface
interface Q3{
    void method();
}

class Test {
    public static void main(String args[]){
        Q3 obj = ()->{
          int arr[]={3,4,23,74,9};
          int i,swap=0,j;
          for(i=0;i<arr.length;i++){
                for(j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]) {
                        swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                    }
                }
          }
          for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        };
        obj.method();
    }
}
