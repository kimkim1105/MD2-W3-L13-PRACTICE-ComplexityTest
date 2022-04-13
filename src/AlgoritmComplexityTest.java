import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlgoritmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        List<Character> stringList = new LinkedList<>();
        int[] frequentChar = new int[255];
        for (int i =0;i<inputString.length();i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii]+=1;
        }
        int max = 0;
        char character1 = (char) 255;
        for (int j = 0; j < 255; j++) {
            if (frequentChar[j]>max){
                max = frequentChar[j];
                character1 = (char) j;
            }
        }
        System.out.println("The most appearing letter is '"+character1+"' with a frequency of "+max+" times");

    }
}
