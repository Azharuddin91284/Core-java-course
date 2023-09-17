import java.util.Scanner;

public class Az {
    public static void main(String[] args) {
        System.out.println("Azharuddin Ansari");
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value:");
        x=sc.nextInt();
        System.out.println("enter the second number:");
        y=sc.nextInt();

        int z=x+y;
        int d=x-y;
        int f=x/y;
        int g=x*y;
        System.out.println("Addition of the two numbers are: " +z);
        System.out.println("Substraction of the Two number: " +d);
        System.out.println("Multiplication of two Number: "+g);
        System.out.println("Division of the Two Number: "+f);
        
    }
    
}
