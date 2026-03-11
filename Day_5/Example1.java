import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
      Example1 ob =new Example1 ();
      int a = 5;

        System.out.println("Left Shift (5 << 1): " + (a << 1));
        System.out.println("Right Shift (5 >> 1): " + (a >> 1));
      
//Ternari Operator
    Example ob =new Example ();
      System.out.println((5>3)?5:3);
      // 5 8 3
      int max=(5>8)?5:(8>3)?8:3;
      System.out.println(max);
//logical && and  bitwise &
    
    System.out.println((5>10)&&(10>5));
    System.out.println((5<10)||(10>5));

    System.out.println((5>10)&(10>5));
    System.out.println((5>10)|(10>5));

    //Increment Decrement Operators
    int num1=20,num2=30;
    System.out.println(num1++ + ++num1);
     System.out.println(num1-- - --num1);
       System.out.println(num1++ > num2-- && ++num1 > num2++);
       System.out.println(num1);
       System.out.println(num2);
