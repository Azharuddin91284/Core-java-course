//Factorial program for loop
import java.util.Scanner;

public class Factorail {
    public static void main(String[] args) {
        int i, fact=1,n;
        System.out.println("Enter the Number which can be find for the factorial:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
        
    }
    
}
