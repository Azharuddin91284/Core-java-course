import java.util.Scanner;
public class Switch {
    
    public static void main(String[] args) {
        System.out.println("Azharuddin Ansari");
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first value:");
        x=sc.nextInt();
        System.out.println("enter the second number:");
        y=sc.nextInt();

        int z=x+y;
        System.out.println("Addition of the two numbers are:" +z);

        int ch;
        System.out.println("Enter the choice:");
        ch=sc.nextInt();
        switch(ch){
            case 1:
            z=x+y;
            System.out.println("Addition of the two numbers are:"+z);
            break;

            case 2:
            z=x-y;
            System.out.println("Substraction of the two numbers are:"+z);
            break;

            case 3:
            z=x*y;
            System.out.println("Multiplication of the two numbers are:"+z);
            break;

            case 4:
            z=x/y;
            System.out.println("Division of the two numbers are:"+z);
            break;

            case 5:
            z=x%y;
            System.out.println("Remainder is:"+z);
            break;

            default:
            System.out.println("Invalid choice");

        }


    
        
    }
    
}

    
