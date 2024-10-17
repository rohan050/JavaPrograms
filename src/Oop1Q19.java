//Make list of Students having name, roll no., age, score. Write a program to
//accept 10 students record and arrange the Students based on the score group
//[0-50], [50-65],[65-80],[80-100].
class Students{
    private String name[]=new String[10];
    private int roll_no[]=new int[10];
    private int age[]=new int[10];
    private int score[]=new int[10];
    public void setDetails(String n[], int rn[], int a[], int s[]){
        name = n;
        roll_no=rn;
        age=a;
        score=s;
        int temp =0;
        String tem;
        for(int i=0; i<roll_no.length;i++){
            for(int j=i+1;j<roll_no.length;j++) {
                if(score[i]>score[j]) {
                    temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;

                    tem=name[i];
                    name[i]=name[j];
                    name[j]=tem;

                    temp=roll_no[i];
                    roll_no[i]=roll_no[j];
                    roll_no[j]=temp;

                    temp=age[i];
                    age[i]=age[j];
                    age[j]=temp;
                }
            }
        }
    }
    private int score0_50[]=new int[10];
    private int score50_65[]=new int[10];
    private int score65_80[]=new int[10];
    private int score80_100[]=new int[10];
    public void stScore(){
        for(int i=0;i<roll_no.length;i++){
            if (score[i] <= 50) {
                score0_50[i]=score[i];
                System.out.println("Student Named "+name[i]+" got scored: "+score0_50[i]+" ");
            }
            if (score[i]<=65 && score[i]>50) {
                score50_65[i]=score[i];
                System.out.println("Student Named "+name[i]+" got scored: "+score50_65[i]+" ");
            }
            if(score[i]<=80 && score[i]>65){
                score65_80[i]=score[i];
                System.out.println("Student Named "+name[i]+" got scored: "+score65_80[i]+" ");
            }
            if(score[i]<=100 && score[i]>80){
                score80_100[i]=score[i];
                System.out.println("Student Named "+name[i]+" got scored: "+score80_100[i]+" ");
            }
        }
    }
}
class D{
    public static void main(String []args){
        Students obj= new Students();
        String name[]={"Ashish","Raghu","Rohan","Rehan","Vishal","Vinod","Binod","Vinayak","Sujal","Rajendra"};
        int score[]={57,55,78,45,74,71,35,46,95,84};
        int roll_no[]={1,2,3,4,5,6,7,8,9,10};
        int age[]={21,18,16,22,23,18,20,18,17,25};
        obj.setDetails(name,roll_no,age,score);
        obj.stScore();
    }
}
