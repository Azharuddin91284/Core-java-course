//1^3 + 5^3 + 3^3 =153 is armstrong number , 1643, 9474

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        int p=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n>0){
            int rem = n % 10;
            p=(p) + (rem * rem * rem);
            n = n / 10;
        }
        if(n == p){
        System.out.println(" Yes it is an Armstrong number:");
        }
        else{
            System.out.println(" No it is not an Armstrong number:");
        }
    }
}