import java.io.*;
public class ConsoAndVowel {
    static void Vowel_or_Consonent(char y){
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u')
        System.out.println("It is a vowel.");

        else
        System.out.println("It is a consonent.");
    }
    public static void main(String[] args) {
        Vowel_or_Consonent('b');
        Vowel_or_Consonent('u');

    }

    
}
