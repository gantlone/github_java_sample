import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question3 {
    public static void main(String argv[])
        throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String strGrade = br.readLine();
            int i = Integer.parseInt(strGrade);
            i = i/10;
            switch(i){
                case 9:
                    System.out.print("A");
                    break;
                case 10:
                    System.out.print("A");
                    break;
                case 8:
                    System.out.print("B");
                    break;
                case 7:
                    System.out.print("C");
                    break;
                case 6:
                    System.out.print("D");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.print("E");
                    break;
            }
        }
    
}
