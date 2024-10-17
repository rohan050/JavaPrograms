//Create class OneBHK with instance variable roomArea , hallArea and price.
//Create default and parameterized constructor.
//Method show(): to print OneBHK data member information.
class OneBHK{
    private int roomArea;
    private int hallArea;
    private int price;
    public OneBHK(int rA, int hA, int p){
        roomArea=rA;
        hallArea=hA;
        price=p;
    }
    public OneBHK(){

    }
    public void show(){
        System.out.println("The Room total area is about "+roomArea+" metre");
        System.out.println("The Hall has total area is about "+hallArea+" metre");
        System.out.println("The Price of One BHK flat is around "+price+" Rs");
    }
}
class E{
    public static void main(String []args){
        OneBHK obj= new OneBHK(32,43,4500000);
        obj.show();
    }
}