import java.util.Scanner;
import java.util.Arrays;
class Arrays {
    static int price=10;
    int gst =2;
    static void display(){
        System.out.println(price+gst);
        return;
    }
    void print();   //method declaration
    void display(){  //methos implementing / define
        System.out.println("disp");  //with args without return
        return;
    }
    int play(){    //without args with return
        return 10;
    }
    double walk(int km){  //with args with return 
        return km+10;
    }
    void speak(int time){ //without args without return
        System.out.println(time);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arrays ob=new Arrays();
        ob display(); //method call

    }
}
