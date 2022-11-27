import java.util.Scanner;

public class Question4 {
    public static void main(String argv[]){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("輸入第一個整數: ");
        int input1 = sc1.nextInt();
        System.out.println("輸入第二個整數: ");
        int input2 = sc2.nextInt();
        System.out.println("請選擇想使用的四則運算(1.+ 2.- 3./ 4.*): \n");
        int input3 = sc3.nextInt();
        switch (input3){
            case 1:
                System.out.println("結果: " + (input1 + input2));
                break;
            case 2:
                System.out.println("結果: " + (input1 - input2));
                break;
            case 3:
                System.out.println("結果: " + (input1 / input2));
                break;
            case 4:
                System.out.println("結果: " + (input1 * input2));
                break;
        } 
    }
}
