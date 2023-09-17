import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the value for checking Wheather the given number is Even or not:");
        i=sc.nextInt();
        if(i %2==0){
            System.out.println("Given number is Even number:");
        }else{
            System.out.println("Given number is not a Even number:");
        }
    }
    
}
