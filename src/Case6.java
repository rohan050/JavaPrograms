class Case6{
    public synchronized void m1(){
        try{
            for(int i=0; i<5;i++){
                System.out.println("The First Thread is in Execution "+Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public synchronized void m2(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Second Thread is in Execution: "+Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static synchronized void m3() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("The Third Thread is in Execution: " + Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static synchronized void m4(){
        try{
            for (int i=0;i<5;i++){
                System.out.println("The Fourth Thread is in Execution: "+Thread.currentThread().getName());
                Thread.sleep(2000);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
class FirstThread extends Thread {
    Case6 task;
    public FirstThread(Case6 task){
        this.task=task;
    }
    public void run(){
        task.m1();
    }
}
class SecondThread extends Thread{
    Case6 task;
    public SecondThread(Case6 task){
        this.task=task;
    }
    public void run(){
        task.m2();
    }
}
class ThirdThread extends Thread{
    Case6 task;
    public ThirdThread(Case6 task){
        this.task=task;
    }
    public void run(){
        task.m3();
    }
}
class FourthThread extends Thread{
    Case6 task;
    public FourthThread(Case6 task){
        this.task=task;
    }
    public void run(){
        task.m4();
    }
}
class TestMania{
    public static void main(String  []args){
        Case6 m1=new Case6();

        FirstThread t1= new FirstThread(m1);
        SecondThread t2=new SecondThread(m1);
        ThirdThread t3=new ThirdThread(m1);
        FourthThread t4= new FourthThread(m1);

        t1.setName("First Thread..");
        t2.setName("Second Thread..");
        t3.setName("Third Thread..");
        t4.setName("Fourth Thread..");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}