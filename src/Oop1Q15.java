
class MathOperations {

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int arr[]) {
        int result = 1;
        for (int i : arr) {
            result *= i;
        }
        return result;
    }
    public double multiply(double a, int b){
        return a*b;
    }
}
class B{
    public static void main(String []args){
        MathOperations obj = new MathOperations();
        int arr[]={5,4,5,7,52,4};
        System.out.println("Multiply of Two Integer Numbers: "+obj.multiply(45,74));
        System.out.println("Multiply of Three Float Numbers: "+obj.multiply(4.2f,3.22f,4.77f));
        System.out.println(("Multiply of Array Elements: ")+obj.multiply(arr));
        System.out.println("Multiply of one Double and one Integer: "+obj.multiply(3.574,7));
    }
}