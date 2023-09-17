import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter the first value:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("Enter the second value:");
        b=sc.nextInt();
        for(int i=0;i<=20;i++){
            System.out.println("Azharuddin Ansari");
        }
        if(a<50){
            c=a+b;

            System.out.println("Addition of the two numbers are:"+c);
        }
        else if(a>50 && a<80){
            c=a-b;
            System.out.println("Substraction of the two nubers are:"+c);
        }
        else{
            c=a*b;
            System.out.println("Multiplication of the two nubers are:"+c);
        }

        }

    }
    
