import java.util.Scanner;
class Box{
    int l,w,h;
    Box(){
        l=w=h=1;
    }
    Box(int l,int w,int h){
        this.l=l;
        this.w=w;
        this.h=h;
     }
     void display(){
        System.out.println("Box: "+l+"*"+w+"*"+h);
     }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Box b=new Box();
        Box b1=new Box(5,6,7);
        b.display();
        b1.display();
}
}
