class MathOperation{
    private int X;
    private int Y;
    private double R;
    public void init(int x, int y){
        X = x;
        Y = y;
    }
    public void multiply(){
        R=X*Y;
        System.out.println("Multiply: "+R);
    }
    public void add(){
        R=X+Y;
        System.out.println("Add: "+R);
    }
    public void power(){
        R = Math.pow(X,Y);
        System.out.println("Power of X is Y then: "+R);
    }
}
class A extends MathOperation{
    public static void main (String []args){
       MathOperation obj= new MathOperation();

       obj.init(45,2);
       obj.add();
       obj.multiply();
       obj.power();
    }
}