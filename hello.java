import java.util.Scanner;
public class hello
 {
    public static void main(String[] args) {
        System.out.println("Azharuddin");
        for(int i=0;i<=100;i++){
            System.out.println("Azharuddin Ansari & Aslam Ansari ");
        }
        int i=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter he value:");
        i=sc.nextInt();
        if(i<4){
            System.out.println("I is less than 4:");
        }
           else if(i>4){
            System.out.println("I is greater than 4:");
           }
           else{
            System.out.println("I is equal to 4:");
           }
        
        int a,b,c,ch;
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the Second number:");
        b=sc.nextInt();
        System.out.println("Enter the choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:
            c=a+b;
            System.out.println("Addition of the two number are :"+c);
            break;

            case 2:
            c=a-b;
            System.out.println("Substraction of two numbers are:"+c);
            break;

            case 3:
            c=a*b;
            System.out.println("Multipliocation of the two numbers are:"+c);
            break;

            case 4:
            c=a/b;
            System.out.println("Division of the two numbers are:"+c);
            break;
            
            case 5:
            c=a%b;
            System.out.println("Remainder is:"+c);
            break;

            default:
            System.out.println("Incorrect choice:");
        }

    }
}
    
