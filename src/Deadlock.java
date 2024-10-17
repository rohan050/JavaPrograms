class Deadlock1 {
    public synchronized void m1() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Thread 1 " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void p1(){
        try{
            for (int i=0; i<2;i++){
                System.out.println("Process 1 "+Thread.currentThread().getName());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
class Deadlock2{
    public synchronized void m2() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Thread 2 " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public synchronized void p1(){
        try{
            for (int i=0; i<2;i++){
                System.out.println("Process 2 "+Thread.currentThread().getName());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}