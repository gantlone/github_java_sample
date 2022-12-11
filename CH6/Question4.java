import java.util.Scanner;

public class Question4 {
    public static void main(String argv[]){
        System.out.println("輸入值不得為0!\n");
        System.out.println("請輸入整數1: ");
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        System.out.println("請輸入整數2: ");
        int input2 = sc.nextInt();
        int bet = 0, sum = 0;
        if (input1 == 0|input2 == 0 ){
            System.out.println("輸入為0，則退出!");
            System.exit(0);
        }

        //比兩者大小
        if (input2 > input1){
            input1 += 1;
            for (bet = input1; bet < input2; bet++){
                sum += bet;
            }
            bet -= 1;
            System.out.println(input1 + " 到 " + bet + " 總和: " + sum);
        }
        else if (input1 > input2){
            input2 += 1;
            for (bet = input2; bet < input1; bet++){
                sum += bet;
            }
            bet -= 1;
            System.out.println(input2 + " 到 " + bet + " 總和: " + sum);
        }
        else{
            System.out.println(input1 + " 到 " + input2 + " 之間整數總和: " + 0);
        }
        

        sc.close();
    }
}
