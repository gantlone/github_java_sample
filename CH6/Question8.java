import java.util.Scanner;

public class Question8 {
    public static void main(String argv[]){
        System.out.println("請輸入密碼(四位整數): ");
        Scanner sc = new Scanner(System.in);
        int password1 = sc.nextInt();
        System.out.println("請再次輸入密碼(四位整數): ");

        int chance = 3;
        while(chance >= 1){
            int password2 = sc.nextInt();
            if (password1 != password2){
                if (chance == 1){
                    System.out.println("耖你媽!");
                }
                else{
                    System.out.println("輸入密碼與第一次輸入不符合，請再輸入一次!");
                }
            }
            else{
                System.out.println("輸入密碼與第一次輸入符合!");
                break;
            }
            chance--;
        } 

        sc.close();
    }
}
