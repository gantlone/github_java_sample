import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int lotto[] = new int[6];
        int bingo[] = {01, 22, 33, 12, 21, 02};
        int i = 0;
        for ( i = 0; i < 6; i++){
            int input = sc.nextInt();
            lotto[i] = input;
        }

        Arrays.sort(lotto);
        Arrays.sort(bingo);

        for (i = 0; i < 6; i++){
            if (lotto[i] == bingo[i]){
                continue;
            }
            else{
                break;
            }
        }
        if (i == 6){
            System.out.println("恭喜中獎!");
        }
        else{
            System.out.println("later b!");
        }
    }
}
