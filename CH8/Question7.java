package CH8;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        math2 ft = new math2();
        System.out.println(ft.sum(input));
    }
}

class math2{
    int sum(int n){
        if(n<1){
            return 0;
        }
        return n + sum(n-1); 
    }
}
