import java.util.Scanner;
class Thing{
    static int count;
    Thing(){
        count++;
    }
    static void getCount(){
        System.out.println(count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Thing ob=new Thing();
        new Thing();
        new Thing();
              
        ob.getCount();
    }
}
