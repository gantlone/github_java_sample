import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question2 {
    public static void main(String argv[])
    throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strGrade = br.readLine();
        int i = Integer.parseInt(strGrade);
        if (i >= 90 && i <= 100){
            System.out.print("A");
        }
        else if (i >= 80 && i <= 89){
            System.out.print("B");
        }
        else if (i >= 70 && i <= 79){
            System.out.print("C");
        }
        else if (i >= 60 && i <= 69){
            System.out.print("D");
        }
        else if (i < 60){
            System.out.print("E");
        }
    }
}
