//Create another class TwoBHK which has all the properties and behaviour of OneBHK and a new instance variable room2Area.
//        Create default and parameterized constructor.
//        Method show(): to print all data member information.
//Write main function in another class(Say XYZ) and store three TwoBHK flat’s.information and print information
//using show method. Also print total amount of all flats.

class XyZ{
    public static void main(String []args){
        int ra[]={21,22,41};
        int r2a[]={22,25,42};
        int ha[]={43,45,62};
        int p[]={8500000,900000,12500000};
        TwoBHK obj=new TwoBHK(ra,r2a,ha,p);
        obj.show();
        System.out.println("The Total Price of Flats is: "+obj.getPrice());
    }
}

class TwoBHK{
    private int []roomArea;
    private int []room2Area;
    private int []hallArea;
    private int price[];
    public TwoBHK(int rA[], int r2A[], int hA[], int p[]){
        roomArea=rA;
        room2Area=r2A;
        hallArea=hA;
        price=p;
    }
    public void show(){
        for(int i=0; i<3;i++){
        System.out.println("The First Room Area for Flat number "+(i+1)+" is: "+roomArea[i]+" Metre");
        System.out.println("The Second Room Area for Flat number "+(i+1)+" is: "+room2Area[i]+" Metre");
        System.out.println("The Hall Area for Flat number "+(i+1)+" is: "+hallArea[i]+" Metre");
        System.out.println("The Price for Flat number "+(i+1)+" is: "+price[i]+" Rs");
        System.out.println();
        }
    }
    public int getPrice(){
        int a=0;
        for(int i =0;i<3;i++)
            a+=price[i];
        return a;
    }
}