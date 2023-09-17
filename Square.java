import java.util.Scanner;
public class Square {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j, row;
        System.out.println("Enter the number of the rows:");
        row=sc.nextInt();
        for(i=1; i<=row; i++){
            for(j=1; j<=row; j++){
                if((i==1 || i == row) || (j ==1 || j == row)){

                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
