interface A1 {
    void game();
}
interface A2 extends A1{
    void same();
}
class A3 implements A2 {
        public void game() {
            System.out.println("Golmaal");
        }
        public void same(){
            System.out.println("Golmaal 2");
        }
        public void venom(){
            System.out.println("Golmaal 3");
        }
}
class Display{
    public static void main(String []args){
        A1 obj=new A3();
        obj.game();
//        obj.same();
//        obj.venom();
    }
}
