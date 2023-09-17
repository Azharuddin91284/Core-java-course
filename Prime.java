import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Prime Numbers are mentioned below:");
        System.out.println("2");
        for(int i=3;i<=100;i++){
            if(i%2!=0){
                
                System.out.println(i);

            }
        }
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the numbers are:");
        int a;
        a=sc.nextInt();
        if(a % 2!=0){
            System.out.println("Prime number is:"+a);
        }else{
            System.out.println("Given number is not a prime number:");
        }

    }
    
}
