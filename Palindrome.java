//A plindrome is a number that is same after reverse
// Example 545, 151,171,343,34543,48984

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r,sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;//getting remainder value
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        System.out.println(" Given number is a Palindrome number:");
        else
        System.out.println(" Given number is not a palindrome number:");
        
    }

    
}
