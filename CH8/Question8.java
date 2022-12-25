package CH8;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        math3 ft = new math3();
        ft.pucci(input);
    }
}

class math3{
    int pucci(int n){
        if(n>1){
            if(n%13 != 0){
                return pucci(n-1);
            }
            System.out.println(n);
            return pucci(n-1);
        }
        return 0;
    }
}
