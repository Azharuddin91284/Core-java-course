import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j, row, col;
        System.out.println("Enter the number of the rows:");
        row=sc.nextInt();
        System.out.println("Enter the number of column: ");
        col=sc.nextInt();
        for(i=0; i<row; i++){
            for(j=0; j< col; j++){
                if(i==0 || i == row-1 || j ==0 || j == col-1){
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
