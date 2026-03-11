import java.util.Scanner;
class Person1{
    private int age;

    public void setAge(int a){
        if(a<0)
        age=a;
    }
    public int getAge(){
        return age;

    }
}
class Person{
    public static void main(String args[]){
        Person1 ob=new Person1();
        ob.setAge(1);
        ob.setAge(0);
        System.out.println(ob.getAge());
    }
}
