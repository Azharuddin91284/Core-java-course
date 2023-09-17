import java.io.*;
public class PerimeterRect { 
    static void perimeter(int length, int breadth){
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimetr of the given  rectangle of length "+ length+ " and breadth "+ breadth + " is+` = " + perimeter);
    }
    public static void main(String[] args){
        int length = 10;
        int breadth = 20;
        perimeter  (length , breadth);
    }
    
}
