package 習題練習.CH9;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] argv){
        System.out.println("請輸入星期幾(數字1~7): ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Dates a = new Dates();
        System.out.println("星期幾：" + a.askDate(input));
        sc.close();
    }
}

class Dates{
    String[] OneToSeven = new String[7];

    Dates(){
        OneToSeven[0] = "mon";
        OneToSeven[1] = "tue";
        OneToSeven[2] = "wed";
        OneToSeven[3] = "thu";
        OneToSeven[4] = "fri";
        OneToSeven[5] = "sat";
        OneToSeven[6] = "sun";
    }
    
    String askDate(int num){
        String day = "";
        day = OneToSeven[num - 1];
        return day;
    }

}
