import java.util.Scanner;
abstract class Laptop1{
    void display(){
        System.out.println("abs");

    }
    abstract void print();
}
class Basic extends Laptop1{
    void print(){
        System.out.println("basic");
    }
}
class Basic2{
    public static void main(String args[]){
        Laptop1 ob=new Laptop1();
        ob.display();
        ob.print();
    }
}
