import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        
//Prime number generator with Labled Break
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = sc.nextInt(); 
        bye: 
        for (int num = 2; num <= limit; num++) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    continue bye;
                }
            }
            System.out.print(num + " ");
        }
       
    }
}
