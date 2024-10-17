//Create class Tile to store the edge length of a square tile , and create another
//class Floor to store length and width of a rectangular floor. Add method
//totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of
//tiles needed to cover the floor completely.
import java.util.Scanner;
class Tile{
    private int edge;
    public Tile(int e){
        edge=e;
    }
    public int getEdge(){
        return edge;
    }
}
class Floor{
    private int length;
    private int breadth;
    public Floor(int l, int b){
        breadth=b;
        length=l;
    }
    public static void main(String []args){
        Scanner v= new Scanner(System.in);
        System.out.println("Enter the Side of Square Tile: ");
        int side = v.nextInt();
        Tile obj= new Tile(side);

        System.out.println("Enter the Length of Rectangular Floor is: ");
        int length=v.nextInt();
        System.out.println("Enter the Breadth of Rectangular Floor is: ");
        int breadth=v.nextInt();
        Floor a=new Floor(length,breadth);
        double total= a.totalTiles(obj);
        System.out.println("The Total tiles take place is: "+total);
    }
    public double totalTiles(Tile obj){

       double totalArea=length*breadth;
       double tile=obj.getEdge();
       double tileArea=tile*tile;
       double totalTiles=totalArea/tileArea;
        return totalTiles;
    }
}