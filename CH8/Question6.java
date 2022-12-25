package CH8;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Fraction ft = new Fraction();
        System.out.println(ft.count(input));
    }
}

class Fraction{
    double count(int n){
        if(n<1){
            return 0;
        }
        double db = (double)1/n;
        return db + count(n-1); 
    }
}